package Class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str="kjfksfAJDSKJD274362374!@##$";
        str=str.replaceAll("[^a-zA-z]","");
        System.out.println("str = " + str);

        String sentence="Batch 14 is great.Batch 14 is excellent?Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));
        String str2="Batch 14 is Great.Batch 14 is Great";
       //it replaces both great to good
        String replacefirst = str2.replaceFirst("Great","Good");
        System.out.println(replacefirst);//It replaces only first great to good not the second one
        System.out.println("str2 = " + str2);


    }
}
