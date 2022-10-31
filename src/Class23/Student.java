package Class23;
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    public class Student {
        void getmarks() {
            System.out.println("I should improve my marks");
        }
            void doHomework()
            {
                System.out.println("Every student needs to do some practice");
                    }
                    void manageTime(){
                        System.out.println("");
        }
}
class SyntaxStudent extends Student{
    void doHomework(){
        System.out.println("I have to do my homework every day");
    }
    void manageTime(){
            System.out.println("Is it very difficult to combine class and work");
    }
}
class CollegeStudent extends Student{
    void doHomework(){
        System.out.println("I have to do my homework every week");
    }
    void manageTime(){
            System.out.println("I work in Starbucks if i don't have class ");
    }
}
class SchoolStudent extends Student{
    void doHomework(){
        System.out.println(" we usually practice in class");
    }
    void manageTime(){
        System.out.println("I have a free time to use facebook");
    }

}