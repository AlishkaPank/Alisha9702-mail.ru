package command;

public class СheckerAttackLeftCommand implements Command {
    private final Сhecker сhecker;

    public СheckerAttackLeftCommand(Сhecker сhecker){
        this.сhecker = сhecker;
    }

    @Override
    public void execute() {
        сhecker.attackLeft();
    }

    @Override
    public void undo() {
        int x = сhecker.getX();
        int y = сhecker.getY();
        if (x > 0 && y < 8){
            сhecker.setXY(x = x + 2, y = y-2);
        }
        System.out.println("Отмена хода 'бить влево'. Вернулась на " + x + "; " + y);
    }
}
