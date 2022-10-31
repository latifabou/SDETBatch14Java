package Class21;

public class Task1 {
  /*  Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle,Square,Box .Use separate class to test your code
            */


}
class Area{

   double rectangleArea(double width,double height){
      double areaOfRectangle=width*height;
      return areaOfRectangle;
   }
double squareArea(double side){
      double areaOfSquare=side*side;
      return areaOfSquare;
}

   double boxVolume(double width,double height,double length){
      double volumeOfBox=width*height*length;
      return volumeOfBox;
   }
}
class Test{
   public static void main(String[] args) {
      Area objectRect = new Area();
      System.out.println(objectRect.rectangleArea(5,4));
      Area objectSq=new Area();
      System.out.println(objectSq.squareArea(3));
      Area objectBox=new Area();
      System.out.println(objectBox.boxVolume(6,9,4));
   }
}