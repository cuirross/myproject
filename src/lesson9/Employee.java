package lesson9;

public class Employee {
    private String email;
    private String telephone;
    private int salary;
    private String fullName;
    private String jobPosition;
    private int age;

    public Employee(String email, String telephone, int salary, String fullName, String jobPosition, int age) {
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.age = age;
    }

    public Employee(String fullName, int age) {
        this.fullName = fullName;
        setAge(age);

    }

    public void setAge(int age) {
        if (age >= 20) {
            this.age = age;
            }
        else{
            System.out.println("Не принимается < 20");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EmployeePrivateDetails{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", age=" + age +
                '}';
    }
}

