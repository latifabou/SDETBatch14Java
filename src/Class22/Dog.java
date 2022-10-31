package Class22;

public class Dog {

        static String dogBreed="Mutt";
        String dogName;
        double dogWeight;

        Dog(String dogName,double DogWeight){
            this.dogName=dogName;
            this.dogWeight=dogWeight;
        }
        void displayInfo(){
            System.out.println(dogName+" Mutt "+dogWeight);
        }

    }
    class Main{

        public static void main(String[] args) {
            Dog dog1=new Dog("Tarzan",10);
            dog1.displayInfo();
        }
    }


