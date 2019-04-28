package interpreters;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Interpreter3 {
    private void interpreter() {


        //CREATE OBJECTS TO THINK WITH
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        miro.setScreenLocation(0, 0);
        SCircle dot = new SCircle(180);

        // REPEATEDLY TAKE A COMMAND FROM AN INPUT DIALOG BOX AND INTERPRET IT
        while (true) {
            String command = JOptionPane.showInputDialog(null, "Command?");
            if (command == null) {
                command = "exit";
            } // user clicked on Cancel
            if (command.equalsIgnoreCase("blue")) {
                miro.setColor(Color.BLUE);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("red")) {
                miro.setColor(Color.RED);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("green")) {
                miro.setColor(Color.GREEN);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("yellow")) {
                miro.setColor(Color.YELLOW);
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("random")) {
                miro.setColor(randomColor());
                miro.paint(dot);
            } else if (command.equalsIgnoreCase("help")) {
                JOptionPane.showMessageDialog(null, "Valid commands are: "
                        + "RED| GREEN | BLUE |YELLOW| HELP| RANDOM | EXIT ");
            } else if (command.equalsIgnoreCase("exit")) {
                miro.end();
                System.out.println("Thank you for viewing the dots ...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Unrecognizable command: "
                        + command.toUpperCase());
            }
        }
    }


    // INFRASTRUCTURE FOR SOME SIMPLE PAINTING
    private Interpreter3() {
        interpreter();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interpreter3::new);
    }


    private static Color randomColor() {
        int rv = (int) (Math.random() * 256);
        int gv = (int) (Math.random() * 256);
        int bv = (int) (Math.random() * 256);
        return new Color(rv, gv, bv);
    }


}
    //{
      //      SwingUtilities.invokeLater(Interpreter3::new);
        //}


    //}
