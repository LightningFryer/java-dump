/**
 * test
 */

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int i;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array limit: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Declaring the array

        for (i=0; i<n; i++){
            System.out.print("Enter array element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nArray: ");

        for (i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}