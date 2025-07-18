package lesson9;

public class Employee {
    private EmployeePrivateDetails employeePrivateDetails;

    public Employee(String fullName, String jobPosition, String email, String telephone, int salary, int age) {
        this.employeePrivateDetails = new EmployeePrivateDetails();
        employeePrivateDetails.setEmail(email);
        employeePrivateDetails.setSalary(salary);
        employeePrivateDetails.setTelephone(telephone);
        employeePrivateDetails.setFullName(fullName);
        employeePrivateDetails.setJobPosition(jobPosition);
        employeePrivateDetails.setAge(age);
    }
    public void printEmployeeInfo (){
        System.out.println("Fullname: " + employeePrivateDetails.getFullName());
        System.out.println("Job Position: " + employeePrivateDetails.getJobPosition());
        System.out.println("Email: " + employeePrivateDetails.getEmail());
        System.out.println("Telephone: " + employeePrivateDetails.getTelephone());
        System.out.println("Salary: " + employeePrivateDetails.getSalary());
        System.out.println("Age: " + employeePrivateDetails.getAge());
    }
    public int getAge(){
       return employeePrivateDetails.getAge();
    }

}

