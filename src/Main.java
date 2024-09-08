public class Main {
    private static Employee[] employees = new Employee[10];
    private static double percent = 1.03;
    private static int department = 1;

    public static Employee createEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
        return employee;
    }

    public static void main(String[] args) {
        employees[0] = createEmployee("Feklisov Vilaly Alexandrovich", 1, 125000);
        employees[1] = createEmployee("Shpalov Alexandr Alexeevich", 1, 120000);
        employees[2] = createEmployee("Kurkin Andrey Vasilyevich", 1, 113000);
        employees[3] = createEmployee("Ivanov Ivan Vladimirovich", 2, 95000);
        employees[4] = createEmployee("Simonov Alexey Vyacheslavovich", 2, 83000);
        employees[5] = createEmployee("Cokolov Yuriy Olegovich", 2, 83500);
        employees[6] = createEmployee("Alexeev Oleg Konstantinovich", 3, 111111);
        employees[7] = createEmployee("Smirnov Alexey Arayevich", 3, 140000);
        employees[8] = createEmployee("Stoyanov Maxim Vyacheslavovich", 4, 123000);
        employees[9] = createEmployee("Turdiev Evgeny Ivanovich", 5, 87000);
        printEmployees();
        System.out.println("calculateSalaryPerMonth() = " + calculateSalaryPerMonth());
        System.out.println("findMinSalary() = " + findMinSalary());
        System.out.println("findMaxSalary() = " + findMaxSalary());
        System.out.println("avgSalary() = " + avgSalary());
        printAllEmployees();
        // indexWages(percent);
        System.out.println("calculateSalaryPerMonth() = " + calculateSalaryPerMonth());
        System.out.println(findMinSalaryEmployee(department));
        System.out.println(findMaxSalaryEmployee(department));
        System.out.println(sumOfSalaryByDepartment(department));
        System.out.println(avgSalaryByDepartment(department));
        indexSalariesInDepartment(percent, department);
        System.out.println(sumOfSalaryByDepartment(department));
        printEmployeesInDepartment(department);
        System.out.println("_________________________________");
        allEmployeesWithSalariesLessThan(114000);
        System.out.println("_________________________________");
        allEmployeesWithSalariesAboveThan(114000);
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static int calculateSalaryPerMonth() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employees[i].getSalary())) {
                minSalaryEmployee = employees[i];

            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employees[i].getSalary())) {
                maxSalaryEmployee = employees[i];

            }
        }
        return maxSalaryEmployee;
    }

    public static int avgSalary() {
        int salary = calculateSalaryPerMonth();
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return salary / counter;
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("employee.getName() = " + employee.getName());
            }
        }
    }

    public static void indexWages(double percent) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * (1 + percent / 100)));
        }
    }

    public static Employee findMinSalaryEmployee(int department) {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employees[i].getSalary())) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee(int department) {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employees[i].getSalary())) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static int sumOfSalaryByDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static int avgSalaryByDepartment(int department) {
        int salary = sumOfSalaryByDepartment(department);
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                counter++;
            }
        }
        return salary / counter;
    }

    public static void indexSalariesInDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * (1 + percent / 100)));
            }
        }
    }

    public static void printEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }

    public static void allEmployeesWithSalariesLessThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() < salary)) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }
    public static void allEmployeesWithSalariesAboveThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && (employee.getSalary() >= salary)) {
                System.out.println(employee.toStringNonDepartmental());
            }
        }
    }

}