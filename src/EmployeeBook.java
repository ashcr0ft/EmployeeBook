public class EmployeeBook {
    private static Employee[] employees = new Employee[10];

    public void createEmployee(String name, int department, int salary) {
        boolean success = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(name, department, salary);
                employees[i] = employee;
                success = true;
                break;
            }
        }
        System.out.println(success);
    }

    public void deleteEmployee(int id) {
        boolean success = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                success = true;
                break;
            }
        }
        System.out.println(success);
    }
    public Employee findEmployee(int id) {
        Employee success = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                success = employee;
                break;
            }
        }
        return success;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculateSalaryPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findMinSalary() {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employees[i].getSalary())) {
                minSalaryEmployee = employees[i];

            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employee.getSalary())) {
                maxSalaryEmployee = employee;

            }
        }
        return maxSalaryEmployee;
    }

    public int avgSalary() {
        int salary = calculateSalaryPerMonth();
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return salary / counter;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("employee.getName() = " + employee.getName());
            }
        }
    }

    public void indexWages(double percent) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * (1 + percent / 100)));
        }
    }

    public Employee findMinSalaryEmployee(int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public int sumOfSalaryByDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int avgSalaryByDepartment(int department) {
        int salary = sumOfSalaryByDepartment(department);
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                counter++;
            }
        }
        return salary / counter;
    }

    public void indexSalariesInDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * (1 + percent / 100)));
            }
        }
    }

    public void printEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }

    public void allEmployeesWithSalariesLessThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() < salary)) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }

    public void allEmployeesWithSalariesAboveThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() >= salary)) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }
}
