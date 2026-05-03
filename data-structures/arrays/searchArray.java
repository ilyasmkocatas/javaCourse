imort java.util.Scannerp;

public class Main {
    pulic static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 9, 2, 8, 3, 5, 4};
    String[] fruits = {"apple", "orange", "banana"};
    boolean isFound = false;
    String target;

    System.out.print("Enter a fuit to search for: ");
    String target = scanner.nextLine();
    

    for (int i = 0; i < numbers.length; i++){
        if(fruits[i].equals(target)){
            System.out.println("Element found at index: " + i);
            isFound = true;
            break;
        }
    }
    if(!isFound){
        System.out.println("Element not found in the array");
    }
    scanner.close();
}
}