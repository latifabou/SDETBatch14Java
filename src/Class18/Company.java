package Class18;

public class Company {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
    String name;
    String address;
    String phone;
    private Company(){
        name="Syntax tech";
    }
    Company(String itsName){
       itsName=name;

    }
    protected Company(String itsName,String itsAddress){
        itsName=name;
        itsAddress=address;
    }
    public Company(String itsName,String itsAddress,String itSphone){
        itsName=name;
        itsAddress=address;
        itSphone=phone;
    }

    public static void main(String[] args) {

        Company company=new Company();
        Company company1=new Company("Samsung");
        Company company2=new Company("HP","456 CA");
        Company company3=new Company("Dell","789 Tx","830 750 4421");

    }
}
