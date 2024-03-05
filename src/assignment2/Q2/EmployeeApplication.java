package assignment2.Q2;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        // Default constructor
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: $" + salary;
    }
}

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setAge(30);
        employee1.setSalary(50000);

        Employee employee2 = new Employee("Jane Smith", 25, 60000);

        displayEmployeeDetails(employee1);
        displayEmployeeDetails(employee2);
    }

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println(employee.toString());
    }
}
