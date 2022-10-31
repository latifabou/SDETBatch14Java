package Class23;

public class StudentTester {
    public static void main(String[] args) {

       Student []student={new CollegeStudent(),new SyntaxStudent(),new SchoolStudent() };
        for(Student st:student){
            st.doHomework();
            st.getmarks();
            st.manageTime();
        }
    }
}
