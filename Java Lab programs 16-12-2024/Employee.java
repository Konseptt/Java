import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, salary);
        emp.displayDetails();
        
        scanner.close();
    }
}
