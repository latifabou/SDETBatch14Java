package Class17;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private String mVowel(String str) {
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                st = st + c;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Task3 task=new Task3();
        String word=task.mVowel("education");
        System.out.println(word);
    }


}


