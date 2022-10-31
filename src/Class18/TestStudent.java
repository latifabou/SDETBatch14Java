package Class18;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Adam", 20, 42, 68);
        Student st2 = new Student("James", 24, 45, 72);
        Student st3 = new Student("Brian", 23, 47, 74);
        Student st4 = new Student("John", 19, 48, 73);
        Student st5 = new Student("Nick", 21, 46, 70);
        st1.AvGrade();
        st2.AvGrade();
        st3.AvGrade();
        st4.AvGrade();
        st5.AvGrade();
    }
}