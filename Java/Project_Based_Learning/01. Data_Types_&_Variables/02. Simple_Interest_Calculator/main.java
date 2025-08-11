import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        int principalAmt = scanner.nextInt();

        System.out.print("Enter the Rate of Interest: ");
        float rateOfInterest = scanner.nextFloat();

        System.out.print("Enter the Years: ");
        int timeInYears = scanner.nextInt();

        double simpleInterest = (principalAmt * rateOfInterest * timeInYears) / 100;

        System.out.println("The Calculated Simple Interest is: " + simpleInterest);

        scanner.close();
    }
    
}
