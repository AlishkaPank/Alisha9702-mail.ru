package abstractFactory.concreteFactories;

        import abstractFactory.*;
        import abstractFactory.concreteProducts.Elf_General;
        import abstractFactory.concreteProducts.Elf_Soldier;
        import abstractFactory.concreteProducts.Elf_Commander;

        import java.util.LinkedList;
        import java.util.List;

//ConcreteFactory

public class Elf_Army implements Army {

    List<Object> army;

    public Elf_Army(){
        army = new LinkedList<>();
    }

    public void put(Object item){
        army.add(item);
    }

    public List<Object> get(){
        return army;
    }

    @Override
    public Soldier createSoldier() {
        return new Elf_Soldier();
    }

    @Override
    public Commander createCommander() {
        return Elf_Commander.getInstance();
    }

    @Override
    public General createGeneral() {
        return new Elf_General();
    }
}
