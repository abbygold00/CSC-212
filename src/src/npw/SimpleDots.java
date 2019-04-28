package npw;

import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class SimpleDots {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleDots();
            }
        });
    }

    public SimpleDots() {
        paintTheImage();
    }

    String colorCommand = getString("color");

    private void paintTheImage() {
        // Grab the input information
        int width = getNumber("width");
        int height = getNumber("height");
        int spacing = getNumber("spacing");

        // Establish the painter
        SPainter painter = new SPainter("Abstract Gradient", width, height);
        SCircle dot = new SCircle(5);


        // Move the painter to the upper left corner to get ready to paint the gradient
        painter.mfd(height / 2);
        painter.tl(90);
        painter.mfd(width / 2 - 10);
        painter.tl(90);

        // Paint it!
        paintGradient(painter, dot, height, width, spacing);


    }

    private static int  getNumber(String prompt) {
        String nss = JOptionPane.showInputDialog(null, prompt + "?");
        Scanner scanner = new Scanner(nss);
        return scanner.nextInt();
    }


    private static String  getString(String prompt) {
        String nss = JOptionPane.showInputDialog(null, prompt + "?");
        Scanner scanner = new Scanner(nss);
        return scanner.next();
    }

    private void paintGradient(SPainter painter, SCircle dot, int height, int width, int spacing) {
        int cols = 0;
        // Calcuate the number of columns. We want to fill the screen, but we don't want
        // any dots only half on the canvas, so we subtract some space.
        int nrOfCols = (width / spacing) - 2;

        while (cols < nrOfCols) {
            nextCol(painter, spacing);
            paintColumn(painter, dot, height, spacing);
            cols = cols + 1;
        }
    }

    private void paintOneDot(SPainter painter, SCircle dot) {
      ColorChanger(painter);
        painter.paint(dot);
    }

    // Dots are spaced tighter together near the bottom of the canvas.
    private void paintColumn(SPainter painter, SCircle dot, int height, int spacing) {
        int travel = spacing;
        int totalDistanceTraveled = 0;

        // Paint a row with decreasing distance between dots.
        while (totalDistanceTraveled < height) {
            totalDistanceTraveled = totalDistanceTraveled + travel;
            painter.mfd(travel);
            paintOneDot(painter, dot);
        }

        // Make the method invariant with respect to painter position.
        painter.mbk(totalDistanceTraveled);
    }

    // Moves the painter to the next column.
    private void nextCol(SPainter painter, int colWidth) {

        painter.tl(90);
        painter.mfd(colWidth);
        painter.tr(90);
    }

    private  void ColorChanger(SPainter painter) {
         if (colorCommand == null) {
                colorCommand = "exit";
            } // user clicked on Cancel
            if (colorCommand.equalsIgnoreCase("blue")) {
                painter.setColor(Color.blue);
            } else if (colorCommand.equalsIgnoreCase("red")) {
                painter.setColor(Color.red);
            } else if (colorCommand.equalsIgnoreCase("green")) {
                painter.setColor(Color.green);
            } else if (colorCommand.equalsIgnoreCase("help")) {
                JOptionPane.showMessageDialog(null, "Valid commands are: "
                        + "RED| GREEN | BLUE |");
            }  else {painter.setColor(Color.black);
            }
        }


    private int randomDistance(int maxDistance) {
        Random rgen = new Random();
        return rgen.nextInt(maxDistance);
    }
}