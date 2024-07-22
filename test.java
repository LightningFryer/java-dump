import java.util.Scanner;

public class test{
    public static void main(String[] args){
        int i, fac=1, num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to find factorial of: ");
        num = scanner.nextInt();

        for (i=1; i<=num; i++){
            fac = fac*i;
        }

        System.out.println("The factorial of " + num + " is " + fac);

        scanner.close();
    }
}