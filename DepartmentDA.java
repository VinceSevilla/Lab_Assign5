class DepartmentDA {
    private HashMap<String, Department> departments;

    public DepartmentDA() {
        departments = new HashMap<>();
    }

    public void create() {
        try {
            BufferedReader departmentReader = new BufferedReader(new FileReader("dept.csv"));
            String line;
            while ((line = departmentReader.readLine()) != null) {
                String[] data = line.split(",");
                String depCode = data[0].trim();
                String depName = data[1].trim();
                departments.put(depCode, new Department(depCode, depName));
            }
            departmentReader.close();

            BufferedReader depEmpReader = new BufferedReader(new FileReader("deptemp.csv"));
            while ((line = depEmpReader.readLine()) != null) {
                String[] data = line.split(",");
                String depCode = data[0].trim();
                String empNo = data[1].trim();
                Double salary = Double.parseDouble(data[2].trim());

                BufferedReader empReader = new BufferedReader(new FileReader("emp.csv"));
                while ((line = empReader.readLine()) != null) {
                    String[] empData = line.split(",");
                    if (empData[0].trim().equals(empNo)) {
                        String lastName = empData[1].trim();
                        String firstName = empData[2].trim();
                        Employee employee = new Employee(empNo, lastName, firstName, salary);

                        Department department = departments.get(depCode);
                        department.addEmployee(employee);
                        department.addToTotalSalary(salary);
                        break;
                    }
                }
                empReader.close();
            }
            depEmpReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printDepartments() {
        for (Department department : departments.values()) {
            System.out.println(department);
            System.out.println("---------------------Details -------------------------");
            System.out.println("EmpNo\t\tEmployee Name\t\tSalary");
            department.printEmployees();
            System.out.println();
        }
    }
}