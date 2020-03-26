package strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива ");
        int length = in.nextInt();

        int[] arr = new int[length];
        System.out.print("Введите числа ");

        for (int i = 0; i < length; ++i){
            arr[i] = in.nextInt();
        }

        Make Strategy = new Make(new AscendingSort()); //создаётся объект который меняет стратегии и ему в конструкторе передаются объекты сортировок
        Strategy.display(Strategy.performSort(arr));
        Strategy.setSorter(new DescendingSort());
        Strategy.display(Strategy.performSort(arr));

    }
}

