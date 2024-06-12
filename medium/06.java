import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonusPercentage = (grade == 'A') ? 0.05 : ((grade == 'B') ? 0.10 : 0.0);
        if (salary < 10000) {
            bonusPercentage += 0.02;
        }

        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalSalary);
    }
}
