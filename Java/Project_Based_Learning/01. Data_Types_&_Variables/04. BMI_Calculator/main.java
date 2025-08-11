import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter your weight (in KG): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in Meters): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        scanner.close();
    }

}
