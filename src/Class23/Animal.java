package Class23;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Cat walk");
    }

    public static void main(String[] args) {
      //  Animal animal= new Animal();//'Animal' is abstract; cannot be instantiated
      //  animal.eat();
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like fish");
            }
            void sleep(){
                System.out.println("Cats like to sleep 12 to 16 hours");
            }
            void showAttitude(){
                System.out.println("hmm hmm hmm hmm");
                            }

}
class Dog extends Animal{
    void eat(){
        System.out.println("Dogs like watermelon");
            }
            void sleep(){
                System.out.println("Dogs like to sleep 8 to 10 hours");
            }
}