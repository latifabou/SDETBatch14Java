package Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Syntax to create an Arraylist
        ArrayList<String>colors=new ArrayList<>();
        //use add method to add elements in arraylist
colors.add("Red");
colors.add("Green");
colors.add("Blue");
colors.add("Yellow");
colors.add("Black");
//prints all elements
        System.out.println(colors);
        //get method prints individual elements from arraylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));

        System.out.println(colors.size());
        System.out.println("===================");
        //getting all the elements through normal loop
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        System.out.println("=================");
        //getting all the elements through enhanced loop
for(String color:colors){
    System.out.println(color);
}


    }
}
