package Class15;

public class Task2 {
   // Create a method that will take a number and prints whether the number is even or odd.
   void isEvenOrOdd(int num) {
      if (num % 2 == 0) {
         System.out.println("Number "+num + " is Even");
      } else {
         System.out.println("Number "+num + " is odd");
      }

   }

   public static void main(String[] args) {
      Task2 Num=new Task2();
      Num.isEvenOrOdd(1509);
   }

}