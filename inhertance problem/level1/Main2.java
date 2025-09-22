class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;
    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    @Override
    void displayDetails() {
        System.out.println("Intern Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + duration);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 80000, 5);
        Employee e2 = new Developer("Bob", 102, 60000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "6 months");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
