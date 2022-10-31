package Class19;

public class Dog extends Animal {
    public Dog(String name, String breed, String color) {
       super(name,breed,color);
    }
}
class Cat extends Animal{
    public Cat(String name, String breed, String color) {
        super(name,breed,color);
    }
}
class test{
    public static void main(String[] args) {
        Dog dog=new Dog("Bobby","Labrador","white");
        dog.printInfo();
        Cat cat=new Cat("lucy","American wirhair","White");
        cat.printInfo();
    }

}