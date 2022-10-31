package Class18;

public class Book {
    /*
     Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
     String name;
    String author;
   private int pages;
   private double price;

    Book(String itName,String itAuthor){
        name=itName;
        author=itAuthor;

    }
    Book(){


    }
}
