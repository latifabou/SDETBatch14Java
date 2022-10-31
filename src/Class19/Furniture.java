package Class19;

public class Furniture {
    String color="Green";
}
class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println("local variable "+color);//prints the local variable
        System.out.println("instance variable from same class "+this.color);// prints the instance var from same class
        System.out.println("instance variable from parent class "+super.color);// prints the instance var of parent
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}