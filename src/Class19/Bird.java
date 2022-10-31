package Class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
   public void printInfo(){
       System.out.println("name "+name+" color "+color+" age "+age+" weight "+weight);
   }
    Bird(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }


}
class Parrot extends Bird{
Parrot(String name,String color,int age,double weight){
super(name,color,age,weight);
    /*this.name=name;
    this.color=color;
    this.age=age;
    this.weight=weight;*/
}
}
class Crow extends Bird {
    boolean isClever;
    Crow(String name, String color, int age, double weight,boolean isClever) {
       super(name,color,age,weight);
       this.isClever=isClever;
        /*this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
    }
}
class Sparrow extends Bird {
    Sparrow(String name, String color, int age, double weight) {
        super(name,color,age,weight);
        /*this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
    }
}



    class Test {
        public static void main(String[] args) {
            Parrot parrot = new Parrot("Zeki", "Green", 1, 2);
            parrot.printInfo();
            Crow crow=new Crow("crow","black",3,1.5,true);
            crow.printInfo();
            Sparrow sparrow=new Sparrow("frost","brown",2,1.3);
            sparrow.printInfo();

        }

    }
