import java.util.Scanner;

public class forLoop {
    public static void forLoop(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i < max; i+=3+9){
            System.out.print(i);
        }
        
        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();
        
        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        
        System.out.println("HAPPY NEW YEAR!");
        
        scanner.close();
    }
}