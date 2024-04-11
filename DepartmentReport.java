import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DepartmentReport {
    private static final String deptFilePath = "/workspaces/Lab_Assign5/dep.csv";
    private static final String depEmpFilePath = "/workspaces/Lab_Assign5/deptemp.csv";
    private static final String empFilePath = "/workspaces/Lab_Assign5/emp.csv";

    public static void main(String[] args) {
        DepartmentDA departmentDA = new DepartmentDA();
        departmentDA.create();
        departmentDA.printDepartments();
    }
}