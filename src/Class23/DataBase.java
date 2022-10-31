package Class23;

abstract public class DataBase {
    abstract void openDataBase();
    abstract void readDate();
    abstract void writeData();
    abstract void closeDataBase();
}
class Microsoft extends DataBase{

    @Override
    void openDataBase() {
        System.out.println("Opening Microsoft Data Base");
    }

    @Override
    void readDate() {
        System.out.println("Reading from Microsoft Data Base");
    }

    @Override
    void writeData() {
        System.out.println("Writing to Microsoft Data Base");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing Microsoft Data Base");
    }
}
class Oracle extends DataBase{

    @Override
    void openDataBase() {
        System.out.println("Opening Oracle Data Base");
    }

    @Override
    void readDate() {
        System.out.println("Reading from Oracle Data Base");
    }

    @Override
    void writeData() {
        System.out.println("Writing to Oracle Data Base");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing Oracle Data Base");
    }
}