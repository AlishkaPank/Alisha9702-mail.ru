package abstractFactory.concreteProducts;

import abstractFactory.Fire;

public class Fairy_Fire implements Fire {

    public void burn() {

        System.out.println("Фея огня выполняет поджог.");
    }
}
