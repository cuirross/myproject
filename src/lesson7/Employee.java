package lesson7;

public class Employee {
    private String name;
    private String jobTitle;
    private String email;
    private int telephoneNumber;
    private int age;

    public Employee(String name, String jobTitle, String email, int telephoneNumber, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }
}
