package Class23;

public class SolutionTask {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
class Student1{
    void study(){
        System.out.println("Student must study");
            }
            void doHomeWork(){
                System.out.println("Students must solve their homework");
            }
            void doPractice(){
                System.out.println("Students must practice to get good marks");
            }
}
class SyntaxStudent1 extends Student1 {
    @Override
    void doHomeWork() {
        System.out.println("Syntax Students must solve all Repls three time");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax Students must do their own research and practice");
    }
}
    class CollegeStudent1 extends Student1{
        @Override
        void doPractice() {
            System.out.println("College Students must practice to get good marks");
                    }
    }

    class SchoolStudent1 extends Student1{

    }

