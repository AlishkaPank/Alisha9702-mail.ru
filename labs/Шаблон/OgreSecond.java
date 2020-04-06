package shablon;

public class OgreSecond extends Game {
    Week day;

    public OgreSecond(Week day){
        this.day = day;
    }

    protected void boil() {
        if (this.day == Week.WorkDay)
            System.out.println("Варит");
        else System.out.println("Жарит");
    }

    public void speak(){
        System.out.println("Разговаривает");
    }
}
