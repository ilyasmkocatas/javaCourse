import java.util.Scanner;

public class userinput{
    public static void userinput(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        System.out.print ("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print ("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean ();

        System.out.println("Hello " + name);
        System.out.print("You are " + age + " years old");
        System.out.print("Your gpa is: " + gpa);
        System.out.print("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are not enrolled as a student");
        }

        // COMMON ISSUE

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Because a String follows to clear the input buffer

        System.out.print("Enter your favorite color; ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + "years old.");
        System.out.println("You linke the color " + color);

        scanner.close();

        // CALCULATE THE AREA OF A RECTANGLE

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Welcome to the Rectangle Area Calculator!");

        System.out.println("Enter the width: ");
        scanner.nextDouble();

        System.out.println("Enter the height: ");
        scanner.nextDouble ();

        area = width * height;

        System.out.println("The area of your Rectangle is: " + area + "cm²");

        scanner.close();
    }
}