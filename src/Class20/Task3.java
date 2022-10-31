package Class20;

public class Task3 {
    /*Write a Java program called Teacher.  Identify features and behaviour of that Class.
     Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
      it their own features and behaviour. Test all 4 classes
     */
}
class Teacher{
String name;
int experience;
double salary;
 String schoolName;
int age;
void printInfo(){
    System.out.println("name "+name+" age "+age+" Salary "+salary+" school name "+schoolName);
}
}
class MathTeacher extends Teacher{
String Subject;
void teachMath(){
    System.out.println("A Match teacher teaches math to students");
}
}
class ChemistryTeacher extends Teacher{
    String Subject;
    void teachChemistry(){
        System.out.println("A Chemistry teacher teaches science of matter");
    }
}
class PianoTeacher extends Teacher{
    String Subject;
    void teachPianoLessons(){
        System.out.println("A Piano Teacher teaches how to play the piano");
    }
}
class test{
    public static void main(String[] args) {
        MathTeacher mathteacher=new MathTeacher();
        mathteacher.name="James";
        mathteacher.salary=65000;
        mathteacher.age=45;
        mathteacher.schoolName="Fairfax";
        mathteacher.printInfo();
    }
}