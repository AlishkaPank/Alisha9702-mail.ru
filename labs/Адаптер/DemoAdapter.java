package adapter;

import java.util.*;

public class DemoAdapter {
    public static Map<String, String> countries = new HashMap<>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args){
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeDataRealization());
        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        IncomeData incomeData;

        public IncomeDataAdapter(IncomeData i){
            incomeData = i;
        }


        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return incomeData.getContactLastName()+", " + incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            return "+" + incomeData.getCountryPhoneCode() + "(0" + incomeData.getPhoneNumber() / 10000000 + ")" + incomeData.getPhoneNumber() % 10000000;
        }
    }

    public interface IncomeData{
        String getCountryCode();
        String getCompany();
        String getContactFirstName();
        String getContactLastName();
        int getCountryPhoneCode();
        int getPhoneNumber();
    }

    static class IncomeDataRealization implements IncomeData{
        String countryCode = "UA";
        String company = "JavaRush Ltd.";
        String firstName = "Ivan";
        String lastName = "Ivanov";
        int phoneCode = 38;
        int phoneNumber = 501234567;


        @Override
        public String getCountryCode() {
            return countryCode;
        }

        @Override
        public String getCompany() {
            return company;
        }

        @Override
        public String getContactFirstName() {
            return firstName;
        }

        @Override
        public String getContactLastName() {
            return lastName;
        }

        @Override
        public int getCountryPhoneCode() {
            return phoneCode;
        }

        @Override
        public int getPhoneNumber() {
            return phoneNumber;
        }
    }

    public interface Customer{
        String getCompanyName();
        String getCountryName();
    }

    public interface Contact{
        String getName();
        String getPhoneNumber();
    }
}
