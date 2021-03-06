package Week2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //// Read user input
        //Scanner input = new Scanner(System.in);

        //// Create an instance of Week2.Account
        //Week2.Account myAccount = new Week2.Account();

        //// Display the default account info
        //System.out.printf("Initial name is: %s%n%n",myAccount.getName());

        //// Prompt the user for an account name
        //System.out.println("Insert an account name: ");
        //String accName = input.nextLine(); // Read input and save to accName
        //myAccount.setName(accName);
        //System.out.println();

        //// Display account info
        //System.out.printf("Name of myAccount is: %s%n",myAccount.getName());
        Account account1 = new Account("Kris Campbell",1000);
        Account account2 = new Account("John Doe",-7.50);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount);
    }
}
