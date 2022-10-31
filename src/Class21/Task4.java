package Class21;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private int add(int a,int b){
        return a+b;
    }
    private int add(int a,int b,int c){
        return a+b+c;
    }
    private double add(int a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        System.out.println(obj.add(2, 3));
        Task4 obj1=new Task4();
        System.out.println(obj1.add(2, 3));
        Task4 obj2=new Task4();
        System.out.println(obj2.add(2, 3, 4));
    }
}
