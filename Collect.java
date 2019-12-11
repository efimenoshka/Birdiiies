import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Collect {
    private ArrayList<Bird> f;
    int i ;

    public Collect(){

        System.out.println("Enter your number: 0 - parrot, 1 - penguin, 2 - vorobey, 3 - break");
        f = new ArrayList<Bird>();

        Scanner in = new Scanner (System.in);
        i = in.nextInt();

        while (i!=3) {
            switch (i) {
                case 0:
                    f.add(new Parrot ());
                    break;
                case 1:
                    f.add(new Penguin ());
                    break;
                case 2:
                    f.add(new Vorobey ());
                    break;
            }
            System.out.println("Enter your number: 0-parrot, 1 - penguin, 2 - vorobey, 3 - break");
            i = in.nextInt();
        }
    }
    public void fly(){
        for (int j = 0; j < f.size(); j++) {
            (f.get(j)).fly();
        }
    }

    public void draw (Graphics g){
        for (int j = 0; j < f.size(); j++) {
            f.get(j).draw(g);
        }
    }
}
