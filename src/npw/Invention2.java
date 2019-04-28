/** Program that paints 100 red, yellow and orange balloons in a blue sky.
 * It will feature commands.
 */
package npw;

import painter.SPainter;
import shapes.SRectangle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;

public class Invention2 {
    // REQUIRED INFRASTRUCTURE


    public Invention2() {
        paintTheImage();
    }
public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

public void run() {
    new Invention2();
}
        });
    }
    // THE PAINTER DOING ITS THING
    private void paintTheImage() {
        SPainter painter = new SPainter("Balloons", 600, 600);
    paintSky(painter); // ask IntelliJ to generate the stub
         int nrOfRectangle = 10;
         paintRectangle(painter,nrOfRectangle);  // ask IntelliJ to generate the stub
         }
         private void paintSky(SPainter painter) {
        painter.setColor(Color.ORANGE);
         SSquare sky = new SSquare(2000);
         painter.paint(sky);
    }
    private void paintRectangle(SPainter painter, int nrOfRectangle) {
        int i = 1;
    while ( i <= nrOfRectangle) {
        paintOneRectangle(painter);  // ask IntelliJ to generate the stub
         i = i + 1;
    }
    }
    private void paintOneRectangle(SPainter painter) {
       int rn=0;
       int count= 0;
       while(rn<2){
        while(count <21){
        if ( rn == 0 ) {
            painter.setColor(Color.RED);
        } else if ( rn == 1 ) {
            painter.setColor(Color.ORANGE);
        } else {painter.setColor(Color.YELLOW);
        }
        painter.tl(5);
            painter.tr(10);
            SRectangle brick = new SRectangle(196, 94);
        painter.paint(brick);
        painter.setColor(Color.BLACK);
        painter.draw(brick);
        rn++;
        count ++;
        if(rn == 2){
            rn = 0;
        }
//        count++;
    }}}
}