package abstractFactory;

import abstractFactory.concreteFactories.Fairy_Army;
import abstractFactory.concreteFactories.Witch_Army;


public class Main {

    public static void main(String[] args){

        Army fairy_Army = new Fairy_Army();
        fairy_Army.createFairy_Fire();
        fairy_Army.createFairy_Water();
        fairy_Army.createFairy_Air();
        fairy_Army.createFairy_Land();


        Army witch_Army = new Witch_Army();
        witch_Army.createWitch_Fire();
        witch_Army.createWitch_Water();
        witch_Army.createWitch_Air();
        witch_Army.createWitch_Land();


        System.out.println( ((Fairy_Army) fairy_Army));
        System.out.println(((Witch_Army) witch_Army));
    }
}
