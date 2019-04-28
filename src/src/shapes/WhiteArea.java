package shapes;

public class WhiteArea {
public static void main (String[] args){

    double edgelength= 0.75;
    double dotdiameter = (edgelength/8);

    SSquare side = new SSquare(edgelength);
    SCircle dot = new SCircle(dotdiameter/2);

    // area = each area of the dots subtracted from the side area.

    double side1 = side.area()- dot.area();
    double side2 = side.area()- (dot.area()*2);
    double side3 = side.area()- (dot.area()*3);
    double side4 = side.area()- (dot.area()*4);
    double side5 = side.area()- (dot.area()*5);
    double side6 = side.area()- (dot.area()*6);

    double TotalArea = (side1+side2+side3+side4+side5+side6);
    System.out.println("Total White Area=" + TotalArea);

}



}
