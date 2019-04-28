/*
 * Program to paint a blue dot in the context of the Nonrepresentational
 * Painting World, NPW.
 */

package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SRectangle;

public class RedCross{
    // THE SOLUTION TO THE RedCross PROBLEM

    private void paintTheImage()  {
        SPainter klee = new SPainter("RedCross" ,700,600);
        SRectangle emma = new SRectangle(100,400);
        klee.setColor(Color.RED);
        klee.paint(emma);
        klee.tl();
        klee.paint(emma);
    }
    //REQUIRED INFRASTRUCTURE

    public RedCross(){
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new RedCross();
            }

        });

    }
}