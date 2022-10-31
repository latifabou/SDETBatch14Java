package Class15;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.

    public void PalindromeString(String str){

        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equalsIgnoreCase(str)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 st=new Task3();
        st.PalindromeString("Mom");

    }


}
