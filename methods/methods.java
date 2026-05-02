public class methods{
    public static void methods(String[] args){

        // method = a block of reusable code that is executed when called ()

        String name = "Bro";
        int age = 25;

        happyBirthday(name, age);

        System.out.println(square(3));
        System.out.println(cube(3));
        
        String fullName = "Spongebob Squarepants";
        System.out.println(fullName);
        
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n");
        System.out.printf("You are %d years old!\n");
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) { 
        return number * number;
    }
    
    static double cube(double number){
        return number * number * number;
    }
    
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}