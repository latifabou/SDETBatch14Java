package Class15;

public class Task4 {
//Create a method that will say Hello in different language based on the country
// that will passed when method is executed
void Hello(String country){
    if(country.equalsIgnoreCase("USA")){
        System.out.println("Hello");
    }else if(country.equalsIgnoreCase("France")){
        System.out.println("Bonjour");

    }else if(country.equalsIgnoreCase("Spain")){
        System.out.println("Hola ");
    }else if (country.equalsIgnoreCase("Morocco")){
        System.out.println("Asalamou Alaykoum");

    }else {
        System.out.println("hard to say it");
    }
}

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.Hello("france");
    }


}
