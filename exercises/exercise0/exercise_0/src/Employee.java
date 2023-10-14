public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int salary;
    private String department;
    private int yearsOfExperience;
    private boolean isActive;
    String uniqueName;

    void work() {
    }
    void haveMeal() {
    }

    void dayOff() {
    }


    public Employee(int employeeId, String firstName, String lastName, String email, int salary, String department, int yearsOfExperience, boolean isActive, String uniqueName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;
        System.out.println("Employee " + uniqueName + " created.");
    }
}