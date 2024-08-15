package StudentGroup;
import java.util.Scanner;

public class StudentGroup {
    Scanner sc = new Scanner(System.in);
    public String[] names;
    private String[] namesTemp;
    private int n;
    private int index = 0;
    StudentGroup(String[] names, int n){
        this.names = new String[n];
        this.n = n;
        for (int i = 0; i < n; i++){
            System.out.print("Enter name to add: ");
            this.names[i] = sc.nextLine();
            this.index++;
        }
    }

    public void addStudent(String newName){
        this.namesTemp = new String[n+1];
        for (int i = 0; i < n; i++){
            this.names[i] = this.namesTemp[i];
        }
        this.n = this.n+1;
    }

    // this.sc.close();
}
