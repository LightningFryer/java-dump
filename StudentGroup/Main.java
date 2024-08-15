package StudentGroup;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        StudentGroup sg = new StudentGroup(names, n);

        sc.close();
    }
}
