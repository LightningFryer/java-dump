import java.util.ArrayList;

/**
 * ArrayLists
 */
public class ArrayLists {

    public static void main(String[] args) {
        // Dynamic arrays using array lists

        // Array list initialization, don't forget to import the array list from the utils lib
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add elements to array
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);

        // Iterating through array
        int arraySize = numbers.size();

        for (int i=0; i<=arraySize-1; i++){  // Do arraySize-1 since index starts from 0
            System.out.println(numbers.get(i));
        }
        System.out.println();

        // Setting element value at some index
        numbers.set(0, 20);
        System.out.println(numbers.get(0));

        numbers.remove(2); //Removes element at index 2
        System.out.println(numbers);

        System.out.println(numbers.contains(20)); // Checks whether the array contains the element (passed as the argument, here it's 20)

        // And finally to clear the entire array
        numbers.clear();
        System.out.println(numbers); // Should be an empty list

    }
}