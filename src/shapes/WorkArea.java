package shapes;


public class WorkArea {

    public static void main (String[] args){

        SRectangle desk = new SRectangle(24, 36);
        SRectangle book = new SRectangle(8.5, 11);
        SCircle glass = new SCircle(1.15);
        SSquare coaster = glass.inscribingSquare();
        SCircle plates = new SCircle(6);


        //Areas of items on desk and desk
        double deskArea= desk.area();
        double bookArea= (book.area()*2);
        double coasterArea= (coaster.area()*3);
        double platesArea= (plates.area()*3);

        //Areas Added up
        double TotalObjects= (coasterArea+ bookArea+ platesArea);
        double result= deskArea- TotalObjects;

        System.out.println("Result:"+ result);
    }
}
