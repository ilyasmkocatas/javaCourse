public class printFStatement {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output
        
        // %[flags][width][.precision][specifier-character]
        
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        
        System.out.printf("Hello %s\n", name); //STRING
        System.out.printf("Your name starts with a %c", firstLetter); // CHAR
        System.out.printf("You are %d years old\n", age); // INTEGER
        System.out.printf("You are %f inches tall\n", height); // DOUBLE
        System.out.printf("Employed; %b\n", isEmployed); //BOOLEAN
        
        System.out.printf("%s is %d years old", name, age);
        
        // [flags]
        
        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        
        System.out.printf("%+.1f\n", price1); //DISPLAY 1 DIGIT
        System.out.printf("%.2f\n", price2); //DISPLAY 2 DIGIT
        System.out.printf("%.3f\n", price3); //DISPLAY 3 DIGIT
        
                
        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        
    }
}