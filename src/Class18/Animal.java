package Class18;

public class Animal {
    protected String name;
    String breed;
    int age;
    double weight;
    void printInfo(){
        String name="now this will be printed";//Java will only be confused if there is a conflict.
        //two same type variables can't coexist.Java always prefers local variable in case of non specification
        System.out.println("name "+this.name+" breed "+breed+" age "+age+" weight "+weight);
    }


    }
