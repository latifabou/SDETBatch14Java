package Class18;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each student's name.
NOTE: please use different names for instance and local variables.
     */
    private String name;
    private int homeworkGrade;
    private int quizGrade;
   private int testGrade;
   private     double averageGrade;
    Student(String stName, int homeWGrade, int qzGrade, int tstGrade) {
        name=stName;
        homeworkGrade = homeWGrade;
        quizGrade = qzGrade;
        testGrade = tstGrade;
    }
    public void AvGrade() {
        averageGrade = (homeworkGrade + quizGrade + testGrade) / 3;
        System.out.println("Average grade for "+name+" is " + averageGrade);
    }
}
