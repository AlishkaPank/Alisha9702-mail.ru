package command;

public class СheckerAttackRightCommand implements Command {
    private final Сhecker сhecker;

    public СheckerAttackRightCommand(Сhecker сhecker) {
        this.сhecker = сhecker;
    }

    @Override
    public void execute() {
        сhecker.attackRight();
    }

    @Override
    public void undo() {
        int x = сhecker.getX();
        int y = сhecker.getY();
        if (x > 0 && y > 0) {
            сhecker.setXY(x = x - 2, y = y - 2);
        }
        System.out.println("Отмена хода 'бить вправо'. Вернулась на " + x + "; " + y);
    }
}
