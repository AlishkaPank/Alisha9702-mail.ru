package command;


public class Сhecker {
    private int x;
    private int y;

    public Сhecker(){
        x = 1;
        y = 1;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void goRight(){
        ++x;
        ++y;
        System.out.println("Шашка ходит  вправо на " + x + "; " + y);
    }

    public void goLeft(){
        --x;
        ++y;
        System.out.println("Шашка ходит налево на " + x + "; " + y);
    }

    public void attackRight(){
        x= x + 2;
        y = y + 2;
        System.out.println("Шашка бьёт по правой диагонали на " + x + "; " + y);
    }

    public void attackLeft(){
        x = x - 2;
        y = y + 2;
        System.out.println("Шашка бьёт по левой диагонали " + x + "; " + y);
    }
}
