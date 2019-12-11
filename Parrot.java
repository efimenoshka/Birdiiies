import java.awt.*;
import java.lang.String;

public class Parrot extends Bird{

    private static int PAR_NUM = 0;
    public static  int minX = 500, minY = 500, maxX = -500, maxY = -500;
    public static int sizeBird = 10;

    public Parrot(){
        PAR_NUM ++;
        int x = (int)(Math.random()*800+100-500);
        int y = (int)(Math.random()*800+100-500);
        //int x = (int)(Math.random()*((getMaxX()-getMinX())+1) + getMinX());
        //int y = (int)(Math.random()*((getMaxY()-getMinY())+1) + getMinY());
        maxX = Math.max(x, maxX);
        minX = Math.min(x, minX);
        maxY = Math.max(y, maxY);
        minY = Math.min(y, minY);
        this.setGraph(x, y, sizeBird, new Color(8, 255, 20));
        System.out.println("I'm a parrot");
    }

    public void talk(Parrot par){ System.out.println("I'm parrot and you are parrot. I can talk with you"); }
    public void talk(Penguin pen){ System.out.println("I'm parrot and you are penguin. I cannot talk with you"); }

    public static int Num() { return PAR_NUM; }

}
