package week11_review;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching");
    }
}
