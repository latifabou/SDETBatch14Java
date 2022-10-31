package Class22;

    public class Person {

        String name;
        String lastName;
        int age;

        Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

    }

    class Employee extends Person {
        int salary;

        Employee(String name, String lastName, int age, int salary) {
            super(name, lastName, age);
            this.salary = salary;
        }

        void printInfo() {
            System.out.println(name + " " + lastName + " " + age + " " + salary);
        }
    }

    class Student extends Employee {
        int grade;

        Student(String name, String lastName, int age, int salary, int grade) {
            super(name, lastName, age, salary);

            this.grade = grade;
        }

        void printInfo() {
            System.out.println(name + " " + lastName + " " + age + " " + grade);
        }
    }

    class Retiree extends Student {
        String seniorActivity;

        Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
            super(name, lastName, age, salary, grade);
            this.seniorActivity = seniorActivity;
        }

        void printInfo() {
            System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
        }
    }

    class Test {
        public static void main(String[] args) {

            Employee employee=new Employee("Joe","Smith",35,35000);
            employee.printInfo();
            Student student=new Student("Adam","Smith",15,0,10);
            student.printInfo();
            Retiree retiree=new Retiree("Frank","Smith",15,0,0,"tour");
            retiree.printInfo();

        }
    }


