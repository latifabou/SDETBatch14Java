package Class25;

import java.util.ArrayList;

public class ArrayListHW {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("James");
        names.add("Jack");
        names.add("John");
        names.add("Josh");
        names.add("Jane");
        System.out.println("is this arrayList empty? "+names.isEmpty());
        System.out.println("the size of this arrayList is "+names.size());
        System.out.println("is Josh present in this arrayList? "+names.contains("Josh"));



    }

}
