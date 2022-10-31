package Class23;

public interface Person {
    void eat();
    }
    interface Employee{
    void work();
    }
interface SyntaxEmployee extends Person,Employee{
    void createRepl();
}
class Asghar implements SyntaxEmployee{
    public void eat(){
        System.out.println("Like to eat gilled fish");
    }
    public void work(){
        System.out.println("Teaches batch 14");
    }

    @Override
    public void createRepl() {
        System.out.println("Create easy Repls");
    }
}
