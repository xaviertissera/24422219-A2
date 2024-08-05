public class Employee extends Person {
    private String employeeId;
    private String position;

    // Default
    public Employee() {
    }

    // With parameters
    public Employee(String name, int age, String gender, String employeeId, String position) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.position = position;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



}