/*
 * Program to draw rectangles of stars in the standard output stream. The
 * dimensions of the rectangle are read from the standard input stream.
 */

package npw;

import java.util.Scanner;

public class TextRectangles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nNumber of rows: ");
        int rows = input.nextInt();

        System.out.print("\nNumber of cols: ");
        int cols = input.nextInt();

        drawRectangle(rows, cols);

    }

    private static void drawRectangle(int nrOfRows, int nrOfColumns) {
        int i = 1;
        while ( i <= nrOfRows) {
            drawOneRow(nrOfColumns);
            System.out.println();
            i=i+1;
        }

    }

    private static void drawOneRow(int nrOfColumns) {
        int i = 0;
        while (i < nrOfColumns) {
            System.out.print("*");
            i = i + 1;
        }

    }
}