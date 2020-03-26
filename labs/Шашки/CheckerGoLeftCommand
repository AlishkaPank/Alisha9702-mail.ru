package command;

public class CheckerGoLeftCommand implements Command{
    private final Сhecker сhecker;

    public CheckerGoLeftCommand(Сhecker сhecker){
        this.сhecker = сhecker;
    }

    @Override
    public void execute() {
        сhecker.goLeft();
    }

    @Override
    public void undo() {
        int x = сhecker.getX();
        int y = сhecker.getY();
        if (x > 0 && y > 0){
            сhecker.setXY(++x, --y);
        }
        System.out.println("Отмена хода 'вперёд налево'. Вернулась на " + x + "; " + y);
    }
}
