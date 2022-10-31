package Class19;

class Vehicule{
int nOfWeel;
int TopSpeed;
void printTopSpeed(){
    System.out.println(TopSpeed);
}
}
public class Car extends Vehicule {
    String model;
    String make;
    int year;

}
class Tesla extends Car{
void printInfo(){
    System.out.println("I am an Electrical car");
}
}
class Toyota extends Car{
    void printInfo(){
        System.out.println("I am a combustion car");
    }
}
/*
class CostumeCar extends Toyota,extends Tesla{
    not allowed in java because it is diamond problem
}

 */
class Tester{
    public static void main(String[] args) {
       Toyota toyota=new Toyota();
       toyota.printTopSpeed();
    }
}
