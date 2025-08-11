import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance (in KM): ");
        double kilometers = scanner.nextDouble();
        double meters = kilometers * 1000;
        double centimeters = kilometers * 100000;
        double milimeters = kilometers * 1000000;
        System.out.println("The Converted values of " + kilometers + " KM is " + String.format("%.2f", meters) + " M, " 
        + String.format("%.2f", centimeters) + " CM, " 
        + String.format("%.2f", milimeters) + " MM.");

        scanner.close();
    }
    
}
