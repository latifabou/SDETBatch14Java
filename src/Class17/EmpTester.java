package Class17;

public class EmpTester {
    public static void main(String[] args) {
        Employee josh=new Employee("Josh"
                ,"IT",120000,25);
        josh.printSalary();
        josh.calculatePrintTax();

        //Below we have more constrcutor calls

        StringBuilder sb=new StringBuilder("Str");
        String str=new String("value");
    }
}
