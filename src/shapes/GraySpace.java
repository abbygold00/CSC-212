package shapes;

public class GraySpace{
        public static void main (String[] args){

            double darkgray = 40;
            double lightgraygap = 3;
            double numberoflightgraygap =2;
            double numberofgraysquares = 2;
            double muberoforangesquares = 1;
            double orangesquaresgap = 4.5;
            SSquare darkgraysquare =new SSquare(darkgray);

           //Light gray squares

            double lightgraydiagnol =(darkgray-(lightgraygap*numberoflightgraygap)) / numberofgraysquares;
            double grayCircleradius = lightgraydiagnol/2;
            SCircle darkgraycircles =  new SCircle(grayCircleradius);
          //  SCircle



}}

