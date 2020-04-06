package shablon;

public class Main {

    public static void main(String[] args){

        Game ogreFirst = new OgreFirst();
        ogreFirst.make();

        Game ogreSecond = new OgreSecond(Week.WeekEnd);
        ogreSecond.make();
    }
}
