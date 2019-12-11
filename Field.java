import javax.swing.*;
import java.awt.*;

public class Field extends JFrame {

    private Collect f;

    /*private int width;
    private int height;

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }*/

    public Field (){
        super("Птицы");
        this.setSize (1000,1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Field (Collect f){
        this();
        this.f =f;
    }

    @Override
    public void paint (Graphics g){

        g.setColor(Color.WHITE);
        g.clearRect(0,0, getWidth(),getHeight());

        //super.paintComponents(g);

        g.setColor(new Color (0, 0, 0, 254));
        g.translate(getWidth()/2,getHeight()/2);

        g.drawLine(0-getWidth()/2,0,getWidth()/2,0);
        g.drawLine(0,0-getHeight()/2,0,getHeight()/2);

        f.draw(g);

        if (Parrot.Num() > 0){
            g.setColor(new Color(64, 255, 28));
            g.drawRect(Parrot.minX, Parrot.minY, (Parrot.maxX - Parrot.minX) + Parrot.sizeBird, (Parrot.maxY - Parrot.minY) + Parrot.sizeBird);
        }

        if (Penguin.Num() > 0) {
            g.setColor(new Color(12, 21, 255));
            g.drawRect(Penguin.minX, Penguin.minY, (Penguin.maxX - Penguin.minX) + Penguin.sizeBird, (Penguin.maxY - Penguin.minY) + Penguin.sizeBird);
        }

        if (Vorobey.Num() > 0) {
            g.setColor(new Color(255, 16, 16));
            g.drawRect(Vorobey.minX, Vorobey.minY, (Vorobey.maxX - Vorobey.minX) + Vorobey.sizeBird, (Vorobey.maxY - Vorobey.minY) + Vorobey.sizeBird);
        }
    }
}
