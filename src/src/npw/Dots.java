
package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Dots {

    private void paintTheImage() {
        SPainter klee = new SPainter("Dots", 1000, 1000);
        SCircle dot = new SCircle(50);

        klee.setColor(Color.BLUE);
        klee.moveToCenter();
        klee.paint(dot);

        klee.moveToCenter();
        dot.shrink(2);
        klee.mrt(dot.radius()*3);
        klee.setColor(Color.RED);
        klee.paint(dot);

        klee.moveToCenter();
        dot.shrink(5);
        klee.mrt(dot.radius()*6);
        klee.setColor(Color.BLUE);
        klee.paint(dot);

        klee.moveToCenter();
        dot.shrink(10);
        klee.mrt(dot.radius()*14);
        klee.setColor(Color.YELLOW);
        klee.paint(dot);

        klee.moveToCenter();
        dot.shrink(2);
        klee.mrt(dot.radius()*12);
        klee.setColor(Color.RED);
        klee.paint(dot);

        //left side of page
        klee.moveToCenter();
        dot.shrink(5);
        klee.mlt(dot.radius()*5);
        klee.setColor(Color.BLUE);
        klee.paint(dot);

        klee.moveToCenter();
        klee.mlt(dot.radius()*7);
        klee.setColor(Color.RED);
        klee.paint(dot);

        klee.moveToCenter();
        dot.shrink(10);
        klee.mlt(dot.radius()*15);
        klee.setColor(Color.YELLOW);
        klee.paint(dot);




    }

    private double dot2() {
        return 0;
    }

    public Dots(){
        paintTheImage();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Dots();}

         });
      }

}