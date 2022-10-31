package Class18;

public class ThisKeywordDemo {
    String str="Red";
   void printInfo(){
       String str="Blue";
       System.out.println("local variable: "+str);
   }

    void printInfo1(){
        String str="Blue";
        System.out.println("instance variable: "+this.str);// if I put this,it will print red.
    }
    void printInfo2(){
        String str="Blue";
        System.out.print("Bouth of them:");
        System.out.print(str+" ");
        System.out.print(this.str);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().printInfo();
        System.out.println("===========");
new ThisKeywordDemo().printInfo1();
        System.out.println("===========");
        new ThisKeywordDemo().printInfo2();
    }
}
