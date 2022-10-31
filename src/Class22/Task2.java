package Class22;

public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

}
class CreditCard{
  double balance;
  double interest;
  double interestCalcul(double balance){
    double intRate=0.15;
    return interest=balance*intRate;
  }
}
class Visa extends CreditCard
{
}
class AX extends CreditCard {
  double interestCalcul(double balance){
    double intRate=0.25;
    return interest=balance*intRate;
  }
}
class TestCreditCard{
  public static void main(String[] args) {
    AX ax=new AX();
    System.out.println(ax.interestCalcul(1000));
    Visa visa=new Visa();
    System.out.println( visa.interestCalcul(1000));
    CreditCard creditCard=new CreditCard();
    System.out.println( creditCard.interestCalcul(1000));
  }
}