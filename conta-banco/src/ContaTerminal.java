import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        String agency;
        String clientName;
        double balance = 2413;

        System.out.print("Please enter your account number: ");
        accountNumber = scanner.nextInt();

        System.out.print("Enter your your name: ");
        clientName = scanner.next();

        System.out.print("Enter your agency number: ");
        agency = scanner.next();

        System.out.print("Enter your account balance: ");
        balance = scanner.nextDouble();

        String finalMessage = String.format(
                "Hi %s, it's great to have you in our bank. Your agency number is %s, your account number is %d, and your balance is %.2f",
                clientName, agency, accountNumber, balance);

        System.out.println(" ");

        System.out.println(finalMessage);
    }
}