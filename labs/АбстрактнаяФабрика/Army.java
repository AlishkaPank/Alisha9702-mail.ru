package abstractFactory;

//AbstractFactory

public interface Army {

    void put(Object o);
    Commander createCommander();
    General createGeneral();
    Soldier createSoldier();

}
