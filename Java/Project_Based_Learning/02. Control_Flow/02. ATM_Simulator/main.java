import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        while (true){
            System.out.println("Welcome to ATM Simulator");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int user_choice = scanner.nextInt();

            if (user_choice == 1){
                System.out.println("The available Balance is: " + balance);
            }
            else if (user_choice == 2){
                System.out.print("Enter the amount to Deposit: ");
                int depositAmt = scanner.nextInt();
                balance = balance + depositAmt;
                System.out.println("The Amount " + depositAmt + " is Credited. The available balance is " + balance);
            }
            else if (user_choice == 3) {
                System.out.print("Enter the amount to Withdraw: ");
                int withdrawAmt = scanner.nextInt();
                if (withdrawAmt > balance){
                    System.out.println("Insufficient Balance.");
                }
                else{
                    balance = balance - withdrawAmt;
                    System.out.println("The Amount " + withdrawAmt + " is Debited. The available balance is " + balance);
                }
            }
            else if (user_choice == 4) {
                System.out.println("Thanks for using the ATM Simulator. Bye!");
                break;
            }
            else {
                System.out.println("Invalid Choice!");
            }
        }

        scanner.close();
    }
}



// Using Switch Statement


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int balance = 1000;

//         while (true) {
//             System.out.println("Welcome to ATM Simulator");
//             System.out.println("1. Check Balance");
//             System.out.println("2. Deposit");
//             System.out.println("3. Withdraw");
//             System.out.println("4. Exit");

//             System.out.print("Enter your choice: ");
//             int user_choice = scanner.nextInt();

//             switch (user_choice) {
//                 case 1:
//                     System.out.println("The available Balance is: " + balance);
//                     break;

//                 case 2:
//                     System.out.print("Enter the amount to Deposit: ");
//                     int depositAmt = scanner.nextInt();
//                     if (depositAmt > 0) {
//                         balance += depositAmt;
//                         System.out.println("The Amount " + depositAmt + " is Credited. The available balance is " + balance);
//                     } else {
//                         System.out.println("Invalid deposit amount!");
//                     }
//                     break;

//                 case 3:
//                     System.out.print("Enter the amount to Withdraw: ");
//                     int withdrawAmt = scanner.nextInt();
//                     if (withdrawAmt > 0) {
//                         if (withdrawAmt > balance) {
//                             System.out.println("Insufficient Balance.");
//                         } else {
//                             balance -= withdrawAmt;
//                             System.out.println("The Amount " + withdrawAmt + " is Debited. The available balance is " + balance);
//                         }
//                     } else {
//                         System.out.println("Invalid withdrawal amount!");
//                     }
//                     break;

//                 case 4:
//                     System.out.println("Thanks for using the ATM Simulator. Bye!");
//                     scanner.close();
//                     return;

//                 default:
//                     System.out.println("Invalid Choice!");
//                     break;
//             }

//             System.out.println(); // blank line for readability
//         }
//     }
// }

