package Class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Lubna");
       // names.add(2, "Josh Again");
        names.set(2,"Josh");
        System.out.println(names);

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        numbers.set(0,12000);
        System.out.println(numbers);
        numbers.clear();//delete all the elements from the list
        System.out.println(numbers);



    }
}
