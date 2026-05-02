public class variables
{
    public static void variables (String[] args)
    {
        System.out.print("I like pizza\n"); //This is my first Java Program
        System.out.println("It's really good!");
        System.out.println("buy me more!\n");

        int age = 30;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        double price = 99.99;
        double temperature = 10.5;

        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a  student!");
        }

        String name = "Ilyas";
        String food = "pizza";
        String email = "fakeemail@gmail.com";

        System.out.println("Hello" + name);
        System.out.println("My favourite food is " + food);
        System.out.println("This is my email: " + email);

        System.out.println("Your choice is a " + name + " " + food + " " + email);

        String name1 = "Bro Code";
        int gta = 6;
        double pi = 3.13149;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println(name);
        System.out.println(gta);
        System.out.println(pi);
        System.out.println(isAdmin);
    }
}