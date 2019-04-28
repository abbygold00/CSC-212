/** Program that paints 100 red, yellow and orange balloons in a blue sky.
 * It will feature commands.
 */
package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Invention1 {
    // REQUIRED INFRASTRUCTURE


    public Invention1() {
        paintTheImage();

    }
public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

public void run() {
    new Invention1();
}
        });
    }
    // THE PAINTER DOING ITS THING
    private void paintTheImage() {
        SPainter painter = new SPainter("Balloons", 600, 600);
    paintSky(painter); // ask IntelliJ to generate the stub
         int nrOfBalloons = 10;
         paintBalloons(painter,nrOfBalloons);  // ask IntelliJ to generate the stub
         }
         private void paintSky(SPainter painter) {
        painter.setColor(Color.BLUE);
         SSquare sky = new SSquare(2000);
         painter.paint(sky);

             SSquare square = new SSquare(150);


             }

    private void paintSquare(SPainter painter, SSquare square) {
            painter.moveToCenter();
            painter.setColor(Color.GRAY);

            painter.mrt(square.side());
            painter.paint(square);

            painter.mlt(square.side()*2);
            painter.paint(square);

        }

    private void paintBalloons(SPainter painter, int nrOfBalloons) {
        int i = 1;
    while ( i <= nrOfBalloons ) {
        paintOneBalloon(painter);  // ask IntelliJ to generate the stub
         i = i + 1;
    }
    }
    private void paintOneBalloon(SPainter painter) {
       int rn=0;
       int count= 0;
       while(count <21){
        while(rn<2){
        if ( rn == 0 ) {
            painter.setColor(Color.RED);
        } else if ( rn == 1 ) {
            painter.setColor(Color.YELLOW);
        }
        painter.mfd(10);

            painter.tl(10);
            painter.tr(10);
        int balloonRadius = 20;
        SCircle balloon = new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);
       rn++;

        if(rn == 2){
            rn = 0;
        }
    }}}
}