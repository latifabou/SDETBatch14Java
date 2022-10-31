package Class17;

import Class18.Company;

public class CompanyTest1 {
    public static void main(String[] args) {
        //Company company=new Company();//'Company()' has private access in 'Class18.Company'
        //Company company1=new Company("Samsung");//'Company(java.lang.String)' is not public in 'Class18.Company'.
                                                       //Cannot be accessed from outside package
        //Company company2=new Company("HP","456 CA");//'Company(java.lang.String, java.lang.String)'
                                                                    // has protected access in 'Class18.Company'
        Company company3=new Company("Dell","789 Tx","830 750 4421");
    }
}
