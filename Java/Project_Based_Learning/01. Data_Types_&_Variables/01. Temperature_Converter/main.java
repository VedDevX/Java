import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double tempC = scanner.nextDouble();
        double tempF = (tempC * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + tempF);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double tempF2 = scanner.nextDouble();
        double tempC2 = (tempF2 - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + tempC2);

        scanner.close();
    }
}
