package Class15;

public class Task5 {
    /*Create a method createEmail(). Based on values of users name, lastName and email type,
your method should return complete email Address.
 Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com */
    String creatEmail(String firstName, String lastName, String emailType) {
        return (firstName + lastName + "@" + emailType+".com");


    }

    public static void main(String[] args) {
      Task5 task5=new Task5();
      String emailAdress=task5.creatEmail("John","Snow","gmail");
        System.out.println(emailAdress);
    }


}





