import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in python: ");
        double pythonMarks = scanner.nextDouble();

        System.out.print("Enter the marks in c programming: ");
        double cProgrammingMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Mathematics: ");
        double mathematicsMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Physics: ");
        double physicsMarks = scanner.nextDouble();

        double totalMarks = pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
        double aggregate = totalMarks / 4.0;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Aggregate: " + aggregate);

        if (aggregate > 75) {
            System.out.println("Grade: Distinction");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("Grade: First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Grade: Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Grade: Third Division");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
