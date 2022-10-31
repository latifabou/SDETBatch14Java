package Class19;

public class Test1 {
    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
    }

    static String maxLength(String[] ar) {
        String s = "";
        int max = ar[0].length();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length() > ar[0].length()) {
                max = ar[i].length();
                s = ar[i];
            }

        }
        return s;
    }
}




