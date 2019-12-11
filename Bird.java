import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Bird {

    protected int x, y, size;
    public Color color;
    public static  int minX, minY, maxX, maxY;

    public Bird(){
        System.out.println("I'm a bird");
        Date date = new Date();
        SimpleDateFormat parser = new SimpleDateFormat("hh:mm:ss");
        System.out.println(parser.format(date));
    }

    void fly(){
        System.out.println("I can fly");
    }

    public void draw (Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }

    public void setGraph(int x, int y, int size, Color color) {
        this.x = x; this.y = y; this.size=size; this.color=color;
    }

    public void setGraph(int x, int y, int size) {
        this.x = x; this.y = y; this.size=size;
    }
/*
    public void setMinX(int minX){
        this.minX = minX;
    }

    public void setMaxX(int maxX){
        this.maxX = maxX;
    }

    public void setMaxY(int maxY){
        this.maxY = maxY;
    }

    public void setMinY(int minY){
        this.minY = minY;
    }

    public int getMinX(){
        return minX;
    }

    public int getMaxX(){
        return maxX;
    }

    public int getMaxY(){
        return maxY;
    }

    public int getMinY(){
        return minY;
    }
*/
}
