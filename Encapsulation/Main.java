// Encapsulation is nothing but using getters and setters to manipulate a class. This is done to for code safety.

package Encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lion's name: ");
        String lionName = scanner.nextLine();

        System.out.println("Enter lion's age: ");
        int lionAge = scanner.nextInt();

        scanner.close();

        // Setting the values of the class
        lion1.setAnimalName(lionName);
        lion1.setAnimalAge(lionAge);
        lion1.setAnimalLegs(4);

        // Getting the values
        System.out.println();
        System.out.println("Lion's name is: " + lion1.getAnimalName());
        System.out.println("Lion's age is: " + lion1.getAnimalAge());
        System.out.println("Lion's number of legs: " + lion1.getAnimalLegs());

    }
}
