package abstractFactory.concreteProducts;

import abstractFactory.Commander;

//ConcreteProduct

public class Ogr_Commander implements Commander {

    private static Ogr_Commander instance;

    public static Ogr_Commander getInstance(){

        if (instance == null) {

            instance = new Ogr_Commander();
        }

        return instance;
    }
}
