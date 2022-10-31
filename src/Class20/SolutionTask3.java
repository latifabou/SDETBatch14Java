package Class20;

public class SolutionTask3 {
     /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
     Test all 4 classes.
     */

}

class Teacher1 {
    protected String name;
    protected int age;
    protected int yearsOfExperience;
    Teacher1(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }


    void teach() {
        System.out.println(name + " is teaching");
    }
}

class MathTeacher1 extends Teacher1{

    void teachTheClass(){
        System.out.println("I will teach the class even the world is going to end right after my class");
    }
    MathTeacher1(String name,int age,int noOfYear){
        super(name,age,noOfYear);
    }
}

class ChemistryTeacher1 extends Teacher1{

    boolean teachOrganic;
    ChemistryTeacher1(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }
    void teachChem(){
        System.out.println(name+" teaching Chemistry");
    }
}

class PianoTeacher1 extends Teacher1{

    String pianoType;
    PianoTeacher1(String name, int age, int yearsOfExperience,String pianoType) {
        super(name, age, yearsOfExperience);
        this.pianoType=pianoType;
    }


}
