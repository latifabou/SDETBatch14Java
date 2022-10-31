package Class19;
/*
Write Book class that will have instance variables and 2 Constructors.
 While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class bok {
    String name;
    String author;
    private int pages;
    private double price;
    void displayIfo(){
        System.out.println("name "+name+" author "+author);
    }

    bok(String Name, String Author){
       this.name=Name;
        this.author=Author;

    }
    bok(String name){
this.name=name;

    }

    public static void main(String[] args) {
        bok book1=new bok("the client");
        book1.displayIfo();
        bok book2=new bok("cry,the beloved Country","Alan Platon");
        book2.displayIfo();
    }
}
