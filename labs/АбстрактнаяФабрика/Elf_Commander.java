package abstractFactory.concreteProducts;

import abstractFactory.Commander;

//ConcreteProduct

public class Elf_Commander implements Commander {

    private static Elf_Commander instance;

    public static Elf_Commander getInstance() {

        if (instance == null){

            instance = new Elf_Commander();
        }

        return instance;
    }
}
