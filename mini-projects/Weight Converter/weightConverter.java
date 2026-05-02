import java.util.Scanner;

public class weightConverter {
    public static void weightConverter(String[] args){
        
        // WEIGHT CONVERSION PROGRAM
        
        // PSEUDOCODE:
        
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        
        double weight;
        double newWeight;
        int choice;
        
        // welcome message
        
        System.out.println("Weight Conversion Program");
        
        //prompt for user choice
        
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        
        System.out.println("Choose an option: ");
        choice = scanner.nextInt();
        
        System.out.print(choice);
        
        if(choice == 1){ //option 1 convert lbs to kgs
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if (choice == 2){ //option 2 converts kgs to lbs
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else { // else print not a valid choice
            System.out.println("That was not a valid choice");
        }
        
        scanner.close();
    }
}