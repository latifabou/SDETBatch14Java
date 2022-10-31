package Class18;

public class CompanyTester {
    public static void main(String[] args) {
        //Company company=new Company();//'Company()' has private access in 'Class18.Company'
        Company company1=new Company("Samsung");
        Company company2=new Company("HP","456 CA");
        Company company3=new Company("Dell","789 Tx","830 750 4421");
    }
}
