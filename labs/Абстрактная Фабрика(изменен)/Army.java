package abstractFactory;

public interface Army {

    Fire createFair();
    Water createWater();
    Air createAir();
    Land createLand();

}
