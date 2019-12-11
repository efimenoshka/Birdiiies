import java.awt.*;

public class Penguin extends Bird{

    private static int PEN_NUM = 0;
    public static  int minX = 500, minY = 500, maxX = -500, maxY = -500;
    public static int sizeBird = 15;


    public Penguin(){
        PEN_NUM ++;
        int x = (int)(Math.random()*800+100-500);
        int y = (int)(Math.random()*800+100-500);
        //int x = (int)(Math.random()*((getMaxX()-getMinX())+1) + getMinX());
        //int y = (int)(Math.random()*((getMaxY()-getMinY())+1) + getMinY());
        maxX = Math.max(x, maxX);
        minX = Math.min(x, minX);
        maxY = Math.max(y, maxY);
        minY = Math.min(y, minY);
        this.setGraph(x, y, sizeBird);
        System.out.println("I am the penguin!");

    }

    @Override
    public void fly(){
        System.out.println("I cannot fly!");
    }

    public void talk(Penguin pen){ System.out.println("I'm penguin and you are penguin. I can talk with you"); }
    public void talk(Parrot par){ System.out.println("I'm penguin and you are parrot. I cannot talk with you"); }

    public static int Num() { return PEN_NUM; }

    public void draw (Graphics g) {
        g.setColor(new Color(11, 39, 255));
        g.fillOval(x,y,size,size);
        g.setColor(new Color(74, 138, 250));
        g.fillOval(x+size/3,y+size/3,size/2,size/2);
    }
}