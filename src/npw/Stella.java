
        package npw;

import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Stella {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Stella();
            }
        });
    }

    public Stella() {
        paintTheImage();
    }

    private void paintTheImage() {
        int nrOfSquares = getNumber("Number of Squares");
        SPainter painter = new SPainter("Stella", 800, 800);
        int side = 700;


        paintThePicture(side, nrOfSquares, painter);
    }

    private static int getNumber(String prompt) {
        String nss = JOptionPane.showInputDialog(null, prompt + "?");
        Scanner scanner = new Scanner(nss);
        return scanner.nextInt();
    }

    private void paintThePicture(int side, int nrOfSquares, SPainter painter) {
        int i = side;
        Color color1 = randomColor();
        Color color2 = randomColor();
        while (i > 0) {
            painter.setColor(color1);
            SSquare square = new SSquare(i);
            painter.paint(square);
            i = i - (side / nrOfSquares);
            painter.setColor(color2);
            SSquare square1 = new SSquare(i);
            painter.paint(square1);
            i = i - (side / nrOfSquares);
        }


    }

    private static Color randomColor() {
        int rv = (int) (Math.random() * 208);
        int gv = (int) (Math.random() * 208);
        int bv = (int) (Math.random() * 208);
        return new Color(rv, gv, bv);
    }
}
