package Class21;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(int a,double b){
        return a+b;
    }

    public static void main(String[] args) {
               System.out.println( add(2,3));
        System.out.println( add(2,3));
        System.out.println(add(2,3,4));
    }
}
