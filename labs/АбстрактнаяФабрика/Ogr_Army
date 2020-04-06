package abstractFactory.concreteFactories;

import abstractFactory.*;
import abstractFactory.concreteProducts.Ogr_General;
import abstractFactory.concreteProducts.Ogr_Soldier;
import abstractFactory.concreteProducts.Ogr_Commander;

import java.util.LinkedList;
import java.util.List;

//ConcreteFactory

public class Ogr_Army implements Army {

    List<Object> army;

    public Ogr_Army(){
        army = new LinkedList<>();
    }

    public List<Object> get(){
        return army;
    }

    @Override
    public void put(Object o) {
        army.add(o);
    }

    @Override
    public Commander createCommander() {
        return Ogr_Commander.getInstance();
    }

    @Override
    public General createGeneral() {
        return new Ogr_General();
    }

    @Override
    public Soldier createSoldier() {
        return new Ogr_Soldier();
    }
}
