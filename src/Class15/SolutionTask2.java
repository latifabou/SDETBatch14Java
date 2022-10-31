package Class15;

public class SolutionTask2 {
     /*
    /Create a method that will take a number and prints whether the number is even or odd./
     */

    void printEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+" is Odd");
        }
    }

    public static void main(String[] args) {
        SolutionTask2 task=new SolutionTask2();
        task.printEvenOdd(45);
        task.printEvenOdd(50);

    }
}
