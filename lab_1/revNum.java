package lab_1;
import java.util.Scanner;

public class revNum {
    public static int reverse(int num){
        int rev = 0;
        for (int i = num; i > 0; i /= 10){
            int digit = i%10;
            rev = rev*10 + digit;
        }
        return rev;
    }

    public static boolean isPalindrome(int num){
        if (num == reverse(num)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        int rev = reverse(num);
        System.out.println("Reversed number = " + rev);

        if (isPalindrome(num))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");

        sc.close();
    }
}
