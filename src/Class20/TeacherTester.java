package Class20;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher1 mathTeacher=new MathTeacher1("Gulcan",18,5);
        mathTeacher.teach();
        PianoTeacher1 pt=new PianoTeacher1("James",25,6,"Grand");
        pt.teach();
    }
}
