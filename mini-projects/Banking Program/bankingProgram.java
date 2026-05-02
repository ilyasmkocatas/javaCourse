import java.util.Scanner;

public class bankingProgramm {

    static Scanner scanner = new Scanner(System.in);

    public static void bankingProgram(String[] args){

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            // DISPLAY MENU
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // GET AND PROCESS USERS CHOICE 
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

            // EXIT MESSAGE
            System.out.println("***************************");
            System.out.println("Thank you! Have a nice day!");
            System.out.println("***************************");
            
            scanner.close();
        }
    }

    // showBalance()
    static void showBalanace(double balance){
        // deposit()
        static double deposit(){
            double amount;

            System.out.print("Enter an amount to be deposit: ");
            amount = scanner.nextDouble();

            if(amount < 0){
                System.out.println("Amount can't be negative");
                return 0;
            }
            else{
                return amount;
            }

            return 0;
        }
        //withdraw()
        static double withdraw(double balance){

        double amount;

        System.out.println("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;

        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}