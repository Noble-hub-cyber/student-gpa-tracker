import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total quality points: ");
        double totalQualityPoints = input.nextDouble();

        System.out.print("Enter total credit hours: ");
        double totalCreditHours = input.nextDouble();

        double gpa = totalQualityPoints / totalCreditHours;

        System.out.printf("Your GPA is: %.2f\n", gpa);
    }
}
