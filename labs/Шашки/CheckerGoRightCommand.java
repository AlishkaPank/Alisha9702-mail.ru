package command;

public class CheckerGoRightCommand implements Command {
    private final Сhecker сhecker;

    public CheckerGoRightCommand(Сhecker сhecker){
        this.сhecker = сhecker;
    }

    @Override
    public void execute() {
        сhecker.goRight();
    }

    @Override
    public void undo() {
        int x = сhecker.getX();
        int y = сhecker.getY();
        if (x > 0 && y > 0){
            сhecker.setXY(--x, --y);
        }
        System.out.println("Отмена хода 'вперёд вправо'. Вернулась на " + x + "; " + y);
    }
}
