class Employee {
    private String empNo;
    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String empNo, String lastName, String firstName, Double salary) {
        this.empNo = empNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empNo + "\t\t" + lastName + ", " + firstName + "\t\t" + String.format("%.2f", salary);
    }
}