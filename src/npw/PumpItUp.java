package npw;
import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;

public class PumpItUp {
    SPainter painter = new SPainter("Pump It Up", 600, 600);
    SSquare square = new SSquare(150);

    private void paintTheImage()  {
        paintYellowSquare(painter, square);
        paintRedSquares(painter, square);
        paintBlueSquares(painter, square);
        paintGraySquares(painter, square);
}

    private void paintGraySquares(SPainter painter, SSquare square) {
        painter.moveToCenter();
        painter.setColor(Color.GRAY);

        painter.mrt(square.side());
        painter.paint(square);

        painter.mlt(square.side()*2);
        painter.paint(square);

        painter.moveToCenter();
        painter.mfd(square.side());
        painter.paint(square);

        painter.mbk(square.side());
        painter.mbk(square.side());
        painter.paint(square);
    }

    private void paintBlueSquares(SPainter painter, SSquare square) {
        painter.setColor(Color.BLUE);


        painter.mbk(square.side());
        painter.mbk(square.side());
        painter.paint(square);


        painter.mlt(square.side());
        painter.mlt(square.side());
        painter.paint(square);

    }

    private void paintRedSquares(SPainter painter, SSquare square) {
      painter.setColor(Color.RED);

       painter.mfd(square.side());
       painter.mlt(square.side());
       painter.paint(square);

        painter.mrt(square.side());
        painter.mrt(square.side());
        painter.paint(square);
    }

    private void paintYellowSquare(SPainter painter, SSquare square) {
        painter.setColor(Color.YELLOW);
        painter.center();
        painter.paint(square);
    }

    public PumpItUp(){
        paintTheImage();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new PumpItUp();
            }

        });

    }
}