package week11_review;

public class Person {

    private String name;
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {


            System.out.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0 || age >= 150) {
            System.out.println("invalid name");
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        if (gender != 'F' || gender != 'M') {
            System.out.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender;
    }


    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }



}
