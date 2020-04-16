package abstractFactory.concreteFactories;

import abstractFactory.*;


public class Witch_Army implements Army {


    @Override
    public Fire createWitch_Fire() {
        return new abstractFactory.concreteProducts.Witch_Fire();
    }

    @Override
    public Water createWitch_Water() {
        return new abstractFactory.concreteProducts.Witch_Water();
    }

    @Override
    public Air createWitch_Air() {
        return new abstractFactory.concreteProducts.Witch_Air();
    }

    @Override
    public Fire createWitch_Land() {
        return new abstractFactory.concreteProducts.Witch_Land();
    }
}
