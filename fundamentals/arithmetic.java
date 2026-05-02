public class Arithmetic{
    public static void arithmetic(String[] args) {
        
        // ARITHEMETIC OPERATORS
        
        int x = 10;
        int y = 2;
        int z;
        
        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y; //Rest
        
        System.out.println(z);
        
        // AUGUMENTED ASSIGNMENT OPERATORS
        
        int x1 = 10;
        int y1 = 3;
        
        //x += y; // x = x + y;
        //x -= y;
        
        x1++; //x += 1;
        x1--; //x -= 1;
        
        // ORDER OF OPPERATIONS [P-E-M-D-A-S]
        double result = 2 + 4 * 2 / 2.0;
    }
}