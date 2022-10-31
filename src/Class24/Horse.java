package Class24;

public class Horse {

    String name;
    String breed;
    int age;
    String color;

    public Horse(String name, String breed, int age, double weight) {
       setName(name);
        setBreed(breed);
        setAge(age);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("name can't be empty");
        } else {
            this.name = name;
        }
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("breed can't be empty");
        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
              return age;
    }

    public void setAge(int age) {
        if(age>50){
            System.out.println("your horse is very old,please make sure it is the right age");
        }else if(age<0){
            System.out.println("horse age can't be negative");
        }else{
            this.age=age;
        }
            }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("color can't be empty");
        } else {
            this.color = color;
        }
    }
}

