import java.util.Scanner;

public class nestedLoops{
    public static void nestedLoops(String[] args){

        // nested loop = A loop inside another loop
        // used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol to use : ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}                 