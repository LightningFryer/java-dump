package lab_1;
import java.util.Scanner;

public class findMax {

    public static int maxThroughIfElse(int x, int y, int z){
        if (x > y){
            if (x > z){
                return x;
            }
        }
        else if (y > x){
            if (y > z){
                return y;
            }
        }
        else{
            return z;
        }
        return z;
    }

    public static int maxThroughIf(int x, int y, int z){
        if (x > y){
            if (x > z)
                return x;
        }
        if (y > x){
            if (y > z)
                return y;
        }
        return z;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
       
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        // Finding max through if else ladder
        int maxUsingIfElse = maxThroughIfElse(x, y, z);
        int maxUsingIf = maxThroughIf(x, y, z);

        System.out.println("Max integer through if else ladder = " + maxUsingIfElse);
        System.out.println("Max integer through if ladder = " + maxUsingIf);
        
        sc.close();

    }

}