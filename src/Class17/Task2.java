package Class17;

public class Task2 {
   /* Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    */
    public String strRev(String s){
        StringBuilder st=new StringBuilder(s);
        st=st.reverse();
        String t=st.toString();
        return t;
    }

    public static void main(String[] args) {
        Task2 task=new Task2();
        System.out.println(task.strRev("hello"));

    }
}
