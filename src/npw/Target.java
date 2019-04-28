/*
 * Program to paint a Target
 * Painting World, NPW.
 */

package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Target {

    private void paintTheImage()  {
        SPainter klee = new SPainter("Target" ,600,600);
        SCircle dot = new SCircle(200);
        klee.setColor(Color.RED);
        klee.paint(dot);
        dot = new SCircle(100);
        klee.setColor(Color.WHITE);
        klee.paint(dot);
        dot = new SCircle(50);
        klee.setColor(Color.RED);
        klee.paint(dot);
    }

    //REQUIRED INFRASTRUCTURE

    public Target(){
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Target();
            }

        });

    }
}

