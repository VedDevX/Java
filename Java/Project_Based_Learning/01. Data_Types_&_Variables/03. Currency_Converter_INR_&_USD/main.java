import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the INR Amount to Convert into USD: ");
        double inrAmount = scanner.nextDouble();
        double rateInrToUsd = 83.25;
        double usdAmount = inrAmount / rateInrToUsd;
        System.out.println("The Conversion of " + inrAmount + " INR to USD is: " + String.format("%.2f", usdAmount) + " USD");

        System.out.print("Enter the USD Amount to Convert into INR: ");
        double usdAmount2 = scanner.nextDouble();
        double inrAmount2 = usdAmount2 * rateInrToUsd;
        System.out.println("The Conversion of " + usdAmount2 + " USD to INR is: " + String.format("%.2f", inrAmount2) + " INR");

        scanner.close();
    }
    
}
