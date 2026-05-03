import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        
        fruits[0] = "pineapple" // change index

        int numOfFruits = fruits.length; // get lenght of an array

        // get all elements of an array
        for(int i = 0; i < fruits.length, i++){
            System.out.println(fruits[i]);
        }
        
        // simplifies iteration through an array
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Array.sort(fruits); //sort in the right order

        Array.fill(fruits, "pineapple"); //fill the array all with one value

        System.out.println(fruit[0]);
    }
}