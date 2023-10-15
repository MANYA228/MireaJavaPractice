package Practice4.Exercise6;

public class InheritanceExample {
    public static void main(String[] args) {
        Employer employer1 = new Employer("John", "Doe", 50000);
        Manager manager1 = new Manager("Alice", "Smith", 60000, 2000);

        Employer[] employees = new Employer[2];
        employees[0] = employer1;
        employees[1] = manager1;

        for (Employer employee : employees) {
            System.out.println("Income for " + employee.firstName + " " + employee.lastName + ": " + employee.getIncome());
        }
    }
}
