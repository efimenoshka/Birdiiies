import java.awt.*;

public class Vorobey extends Bird{

    private static int VOR_NUM = 0;
    public static  int minX = 500, minY = 500, maxX = -500, maxY = -500;
    public static int sizeBird = 20;

    public Vorobey(){
        VOR_NUM ++;
        int x = (int)(Math.random()*800+100-500);
        int y = (int)(Math.random()*800+100-500);
        //int x = (int)(Math.random()*((getMaxX()-getMinX())+1) + getMinX());
        //int y = (int)(Math.random()*((getMaxY()-getMinY())+1) + getMinY());
        maxX = Math.max(x, maxX);
        minX = Math.min(x, minX);
        maxY = Math.max(y, maxY);
        minY = Math.min(y, minY);
        this.setGraph(x, y, sizeBird, new Color(255, 7, 7));

        System.out.println ("I am vorobey");
    }

    public static int Num() { return VOR_NUM; }
}
