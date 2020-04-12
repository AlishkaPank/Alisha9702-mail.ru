package command;

public class Main {
    public static void main(String[] args){
        Сhecker checker = new Сhecker();
        Command goRight = new CheckerGoRightCommand(checker);
        Command goLeft = new CheckerGoLeftCommand(checker);
        Command attackR = new СheckerAttackRightCommand(checker);
        Command attackL = new СheckerAttackLeftCommand(checker);

        Move move = new Move();
        move.register("goRight", goRight);
        move.register("goLeft", goLeft);

        move.register("attackRight", attackR);
        move.register("attackLeft", attackL);

        move.execute("goRight");
        move.execute("goLeft");
        move.execute("attackRight");
        move.execute("attackLeft");
        move.undo();
        move.undo();
        move.undo();
        move.undo();

    }
}
