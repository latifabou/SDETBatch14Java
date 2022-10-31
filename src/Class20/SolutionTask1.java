package Class20;

public class SolutionTask1 {
      /*Write program for multilevel inheritance
    where class C inherits from class B and Class B inherits from Class A.
     */


    public static void main(String[] args) {
        //  C c=new C();
        B1 b=new B1();
    }
}

class A1{
    A1(){
        System.out.println("A");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("B");
    }
}

class C1 extends B1{
    C1(){
        System.out.println("C");
    }
}
