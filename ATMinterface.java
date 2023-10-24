import java.util.Scanner;
public class ATMinterface
{
    private static String userId="oasis";
    private static String userPin="12345";
    private static double accountBalance=5000.0;

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ENTER User ID:");
        String inputUserId = scanner.nextLine();

        System.out.println("ENTER PIN");
        String inputPin = scanner.nextLine();

        if (inputUserId.equals(userId) && inputPin.equals(userPin))
        {
            System.out.println("WELCOME to the ATM!\n");
            showMenu();
        }
        else{
            System.out.println("Invalid User ID or PIN! Enter again..");
        }
    }
    private static void showMenu()
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an Option:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    //Implement transaction History
                    break;
                case 2:
                    //Implement withdrawal
                    break;
                case 3:
                    //Implement deposit
                    break;
                case 4:
                    //Implement transfer
                    break;
                case 5:
                    System.out.println("Thank You! for using the ATM.Good Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select option.");
            }
        }
    }
}