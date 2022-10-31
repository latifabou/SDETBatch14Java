package Class20;

public class Task2 {
   /* Write program to inherit class A that has method printF which is static
    and call or reuse that method into class B.*/
   public static void main(String[] args) {
       Task2B.printF();
   }
}
class Task2A{
    static void printF(){
        System.out.println("method inherited");
    }
}
class Task2B extends Task2A{

}