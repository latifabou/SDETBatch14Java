package Class22;

public class AnimalTester {
    public static void main(String[] args) {

        //Panda panda= new Animal();//down-cating
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
        Animal animal=new Panda(); //upcasting
        Animal animal1=new Cat();
Animal animals[]={new Panda(),new Cat()};
    }
}
