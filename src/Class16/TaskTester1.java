package Class16;

public class TaskTester1 {

    public static void main(String[] args) {
        SyntaxEmployee asgharEmp =new SyntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=100000;


        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee moazzamEmp =new SyntaxEmployee();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);


    }

}
