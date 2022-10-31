package Class15;

import java.util.Scanner;

//Create a method that will take 2 parameters as a numbers and prints which number is larger.
public class Task1 {
    int largerNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please entre number 1");
        int number1=input.nextInt();
        System.out.println("please entre number 2");
        int number2=input.nextInt();
        Task1 number= new Task1();
        System.out.println(number.largerNum(number1,number2));
    }


}