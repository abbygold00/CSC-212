package npw;

import java.awt.Color;
import java.util.Random;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;


public class AlternateBalloons {
    // REQUIRED INFRASTRUCTURE
    public AlternateBalloons() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new AlternateBalloons();
            }
        });
    }

    // THE PAINTER DOING ITS THING
    private void paintTheImage() {
        SPainter painter = new SPainter("Balloons", 600, 600);
        paintSky(painter); // ask IntelliJ to generate the stub
        int nrOfBalloons = 300;
        paintBalloons(painter, nrOfBalloons);  // ask IntelliJ to generate the stub
    }

    private void paintSky(SPainter painter) {
        painter.setColor(Color.BLUE);
        SSquare sky = new SSquare(2000);
        painter.paint(sky);
    }

    private void paintBalloons(SPainter painter, int nrOfBalloons) {
        int i = 1;
        while (i <= nrOfBalloons) {
            paintOneBalloon(painter);  // ask IntelliJ to generate the stub
            i = i + 1;
        }
    }

    private void paintOneBalloon(SPainter painter) {
        Random rgen = new Random();
        Color gee = new Color(23, 45, 25);
        Color ge = new Color(230, 4, 25);
        Color geee = new Color(203, 245, 25);
        Color geer = new Color(35, 55, 105);
        Color ger = new Color(1, 95, 205);
        Color gr = new Color(33, 56, 78);
        Color g = new Color(93, 6, 78);


        int rn = rgen.nextInt(6);
        if (rn == 0) {
            painter.setColor(gee);
        } else if (rn == 1) {
            painter.setColor(ge);
        } else if (rn == 2) {
            painter.setColor(geee);
        } else if (rn == 3) {
            painter.setColor(geer);
        } else if (rn == 4) {
            painter.setColor(ger);
        } else if (rn == 5) {
            painter.setColor(gr);
        } else {
            painter.setColor(g);
        }

        painter.move();
        int balloonRadius = 30;
        SCircle balloon = new SCircle(balloonRadius);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);
    }
}
