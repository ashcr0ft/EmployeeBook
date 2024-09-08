public class Main {
    private static double percent = 1.03;
    private static int department = 1;

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createEmployee("Feklisov Vilaly Alexandrovich", 1, 125000);
        employeeBook.createEmployee("Shpalov Alexandr Alexeevich", 1, 120000);
        employeeBook.createEmployee("Kurkin Andrey Vasilyevich", 1, 113000);
        employeeBook.createEmployee("Ivanov Ivan Vladimirovich", 2, 95000);
        employeeBook.createEmployee("Simonov Alexey Vyacheslavovich", 2, 83000);
        employeeBook.createEmployee("Cokolov Yuriy Olegovich", 2, 83500);
        employeeBook.createEmployee("Alexeev Oleg Konstantinovich", 3, 111111);
        employeeBook.createEmployee("Smirnov Alexey Arayevich", 3, 140000);
        employeeBook.createEmployee("Stoyanov Maxim Vyacheslavovich", 4, 123000);
        employeeBook.createEmployee("Turdiev Evgeny Ivanovich", 5, 87000);
        employeeBook.createEmployee("Turdiev Evgeny Ivanovich", 5, 87000);
        //employeeBook.printEmployees();
        employeeBook.deleteEmployee(10);
        employeeBook.deleteEmployee(7);
        employeeBook.printEmployees();
        employeeBook.createEmployee("Turdiev Evgeny Ivanovich", 5, 87000);
        employeeBook.printEmployees();
        System.out.println("------------------------------");
        System.out.println(employeeBook.findEmployee(1));
    }


}