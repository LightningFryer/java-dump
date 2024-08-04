package lab_1;
import java.util.Scanner;

public class findFact {
    public static int fact(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + fact(num));
        
        System.out.print("Enter total number of items: ");
        int n = sc.nextInt();
        System.out.print("Enter number of items being selected: ");
        int r = sc.nextInt();

        int ncr = fact(n) / (fact(n-r) * fact(r));

        System.out.println(r + " items can be selected from " + n + " items " + " in " + ncr + " different ways");

        sc.close();
    }   
}
