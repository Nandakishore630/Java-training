import java.util.Scanner;

// Base class
abstract class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to be overridden
    abstract double calculateSalary();

    // Display method
    void display(String role) {
        System.out.println(
            employeeId + " " + name + " " + role + " " + calculateSalary()
        );
    }
}

// Manager class
class Manager extends Employee {

    Manager(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

// Developer class
class Developer extends Employee {

    Developer(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.10);
    }
}

// Intern class
class Intern extends Employee {

    Intern(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary;
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee details (id name basicSalary role):");
            int id = sc.nextInt();
            String name = sc.next();
            double basicSalary = sc.nextDouble();
            String role = sc.next();

            Employee emp;

            if (role.equalsIgnoreCase("Manager")) {
                emp = new Manager(id, name, basicSalary);
            } else if (role.equalsIgnoreCase("Developer")) {
                emp = new Developer(id, name, basicSalary);
            } else if (role.equalsIgnoreCase("Intern")) {
                emp = new Intern(id, name, basicSalary);
            } else {
                System.out.println("Invalid role");
                continue;
            }

            emp.display(role);
        }

        sc.close();
    }
}