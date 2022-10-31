package Class15;

public class SolutionTask6 {
    /*Write a method to return whether given number is prime or not?*/
    boolean isPrime(int num){
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        SolutionTask6 task6=new SolutionTask6();
        System.out.println(task6.isPrime(4));
        System.out.println(task6.isPrime(5));
    }


}
