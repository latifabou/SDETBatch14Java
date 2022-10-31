package Class20;

public class Task1 {
        /*Write program for multilevel inheritance where class C inherits
    from class B and Class B inherits from Class A
     */
        public static void main(String[] args) {
            C obj1 = new C("Luna","Persian",1,0.5);
            obj1.printInfo();
        }
    }
class A {//Animal
    String name;
    String breed;
    int age;
    double weight;

    public A(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println("name "+name+" breed "+breed+" age "+age+" weight "+weight);
    }
}
class B extends A {//Cat
    public B(String name, String breed, int age, double weight) {
        super(name, breed, age, weight);
    }
}
class C extends B {//Kitten
    public C(String name, String breed, int age, double weight) {
        super(name, breed, age, weight);
    }


}

