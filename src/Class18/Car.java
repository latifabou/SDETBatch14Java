package Class18;
public class Car {
    //common class has differents names:parent class; base class or super class.
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    private String engineType;
    // if a field or a method has private access modifier in parent class child classes can't use it.
    void printCarDetails(){
        System.out.println("model "+model+" make "+make+" color "+color);

    }
}
 class BMW extends Car{
    // child class, subclass,or derived class.
    double engineCC;
  }
class Tesla extends Car{
        }
    class Toyota extends Car{
    double engineCC;
           }
class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.model="x8";
        bmw.color="Black";
        bmw.engineCC=200;
        bmw.printCarDetails();
    }
}