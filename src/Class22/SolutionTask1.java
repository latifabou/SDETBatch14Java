package Class22;

public class SolutionTask1 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes
     */
    public static void main(String[] args) {
        Degree1 degree=new Degree1();
        degree.getPrerequisite();
        Bachelors1 bachelors=new Bachelors1();
        bachelors.getPrerequisite();
        Masters1 masters=new Masters1();
        masters.getPrerequisite();
    }

}
class Degree1{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors1 extends Degree1{

}
class Masters1 extends Degree1{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Master's degree you need Bachelors");
    }
}
