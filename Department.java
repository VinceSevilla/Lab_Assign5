public class Department {
    private String depCode;
    private String depName;
    private double depTotalSalary;

    public Department(String depCode, String depName) {
        this.depCode = depCode;
        this.depName = depName;
    }

    public String getDepCode() {
        return depCode;
    }

    public String getDepName() {
        return depName;
    }

    public double getDepTotalSalary() {
        return depTotalSalary;
    }

    public void setDepTotalSalary(double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }
}
