package Class20;

public class Task5 {


    /*
        Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
         In circle class create a method to calculate the area of circle. Test your code
         */

}
class Shape{
    double radius;

     Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape{

    double areaOfCircle;

     Circle(double radius) {
        super(radius);
    }


    double areaOfCircle(){

         areaOfCircle=3.14*radius*radius;
        System.out.println(areaOfCircle);
        return areaOfCircle;
    }


}
class TestCalcul {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.areaOfCircle();

    }
}




