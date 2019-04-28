/*
 * Ten note line created by joining two JSB minuet figures.
 */
package mmw;
import composer.SComposer;
import note.SNote;
import java.util.concurrent.TimeUnit;

public class TwoFigureMinuetThing {
     public static void main(String[] args) {
      SComposer sc = new SComposer();
     sc.text();
    sc.mms_35_JSB_M10();
    sc.mms_35_JSB_M13();



        SNote note = new SNote();
         note.play();
         note.rp(7); note.play();
         note.s2(); note.lp(); note.play();
         note.lp(2); note.s2(); note.play();
         note.rp();note.play();
         note.x2();note.rp(); note.play();
         note.rp();note.play();
         System.out.println();

         System.out.println();

//second line
         note.play();
         note.rp(7); note.play();
         note.s2(); note.lp(); note.play();
         note.lp(2); note.s2(); note.play();
         note.rp();note.play();
         note.x2();note.rp(); note.play();
         note.rp();note.play();
         System.out.println();

         System.out.println();
    }
}