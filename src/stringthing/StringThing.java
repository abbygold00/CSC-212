/*
*This program will do a bit of character string processing.
*/

package stringthing;
public class StringThing {
   public static void main(String[] args) {
       //POINT A: CREATE A PRINT SOME STRINGS THAT REPRESENT NAMES
        String singer = "Holiday, Billie";
        String sculptor = "Claudel, Camille";
        String painter ="Picasso,Pablo";
        String dancer = "Zotto, Osvaldo";
        String self = "Akinfenwa, Abisola";

       System.out.println("/nNames");
       System.out.println(singer);
       System.out.println(sculptor);
       System.out.println(painter);
       System.out.println(dancer);
       System.out.println(self);

        // POINT B: COMPUTE AND PRINT THE LENGTHS OF THE STRINGS, WITHOUT LABELS
       int singerLength = singer.length();
       int sculptorLength = sculptor.length();
       int painterLength = painter.length();
       int dancerLength = dancer.length();
       int selfLength = self.length();

       System.out.println("/nName lengths...");
       System.out.println("singerLength = " + singerLength);
       System.out.println("sculptorLength = " + sculptorLength);
       System.out.println("painterLength = " + painterLength);
       System.out.println("dancerLength = " + dancerLength);
       System.out.println("selfLength = " + selfLength);

        // POINT C: COMPUTE AND PRINT THE LOCATION OF THE COMMA WITHIN EACH STRING, NO LABELS
       int singerCommaPosition = singer.indexOf(",");
       int sculptorCommaPosition= sculptor.indexOf(",");
       int painterCommaPosition = painter.indexOf(",");
       int dancerCommaPosition = dancer.indexOf(",");
       int selfCommaPosition = self.indexOf(",");

       System.out.println("/nComma positions ...");
       System.out.println("singerComma positions");
       System.out.println("sculptorComma positions ");
       System.out.println("painterComma position");
       System.out.println("selfComma positions");


       // POINT D: COMPUTE AND PRINT THE FIVE FIRST NAMES, WITH NO LABELS
        // POINT E: COMPUTE AND PRINT THE FIVE LAST NAMES, WITH NO LABELS
        // POINT F: COMPUTE AND PRINT THE FIRST NAMES, AGAIN
        //        System.out.println("\nFirst names, once again ...");
        //        System.out.println(firstName(singer));
        //        System.out.println(firstName(sculptor));
        //        System.out.println(firstName(painter));
        //        System.out.println(firstName(dancer));
        //        System.out.println(firstName(self));

        // POINT G: COMPUTE AND PRINT THE LAST NAMES, AGAIN
        //        System.out.println("\nLast names, once again ...");
        //        System.out.println(lastName(singer));
        //        System.out.println(lastName(sculptor));
        //        System.out.println(lastName(painter));
        //        System.out.println(lastName(dancer));
        //        System.out.println(lastName(self));
        // POINT H: COMPUTE AND PRINT THE FULL NAMES, NATURAL STYLE
        //        System.out.println("\nFull names, natural style ...");
        //         System.out.println(fullName(singer));
        //        System.out.println(fullName(sculptor));
        //        System.out.println(fullName(painter));
        //        System.out.println(fullName(dancer));
        // System.out.println(fullName(self));
   }

}