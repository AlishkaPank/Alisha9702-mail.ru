package abstractFactory.concreteFactories;

import abstractFactory.*;

public class Fairy_Army implements Army {

    @Override
    public Air createFairy_Air() {
        return new abstractFactory.concreteProducts.Fairy_Air();
    }

    @Override
    public Fire createFairy_Fire() {
        return new abstractFactory.concreteProducts.Fairy_Fire();
    }

    @Override
    public Water createFairy_Water() {
        return new abstractFactory.concreteProducts.Fairy_Water();
    }

    @Override
    public Land createFairy_Land() {
        return new abstractFactory.concreteProducts.Fairy_Land();
    }
}
