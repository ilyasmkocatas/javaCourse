import java.util.Scanner;

public class enhanchedSwitches {
    public static void enhanchedSwitches(String[] args) {
        
        // Enhanced switch = A replacement to many else if statements
        // (Java14 feature)
        
        String day = "Friday";
        
        if(day.equals("Monday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Tuesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Wednesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Thursday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Friday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Saturday")) {
            System.out.println("It is the weekend");
        }
        else if(day.equals("Sunday")){
            System.out.println("It is the weekend");
        }
        else {
            System.out.println(day + " is not a day");
        }
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter the day of the week: ");
        String day1 = scanner.nextLine();
        
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> 
                System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}