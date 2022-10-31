package Class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openDataBase();
        dataBase.readDate();
        dataBase.writeData();
        dataBase.closeDataBase();
    }
}
