import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which table you want to generate: ");
        int table = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int product = table * i;
            System.out.println(product);
        }

        scanner.close();
    }
}
