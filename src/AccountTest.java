import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Read user input
        Scanner input = new Scanner(System.in);

        // Create an instance of Account
        Account myAccount = new Account();

        // Display the default account info
        System.out.printf("Initial name is: %s%n%n",myAccount.getName());

    }
}
