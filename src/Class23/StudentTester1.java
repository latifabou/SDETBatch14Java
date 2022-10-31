package Class23;

public class StudentTester1 {
    public static <student1> void main(String[] args) {
        Student1[]arr={new CollegeStudent1(),new SyntaxStudent1(),
                new SchoolStudent1()};
        for(Student1 st:arr){
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
