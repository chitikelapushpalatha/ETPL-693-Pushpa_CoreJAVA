package com.evergent.corejava.pushpa.CaseStudyHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class EmployeeManagementSystem {
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a new employee
    public void addEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
        employeeMap.put(id, new Employee(name, department));
        System.out.println("Employee added successfully.");
    }

    // Retrieve employee details
    public void getEmployee() {
        System.out.print("Enter employee ID to retrieve: ");
        int id = scanner.nextInt();
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println("Employee details: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Update employee information
    public void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.print("Enter new employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new employee department: ");
            String department = scanner.nextLine();
            employee.setName(name);
            employee.setDepartment(department);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Remove an employee
    public void removeEmployee() {
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        if (employeeMap.remove(id) != null) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // List all employees
    public void listAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to list.");
        } else {
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. List All Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    getEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    listAllEmployees();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.showMenu();
    }
}
