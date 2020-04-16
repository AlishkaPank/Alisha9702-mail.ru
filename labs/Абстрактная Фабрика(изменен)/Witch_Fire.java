package abstractFactory.concreteProducts;

import abstractFactory.Fire;

public class Witch_Fire implements Fire {

    public void burn() {

        System.out.println("Ведьма огня выполняет поджог.");
    }
}
