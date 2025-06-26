import java.util.Scanner;

class PrintEven extends Thread {
    int n;
    PrintEven(int n){
        this.n = n;
    }
    
    @Override
    public void run(){
        System.out.print(n + " ");
    }
}

class PrintOdd extends Thread {
    int n;
    PrintOdd(int n){
        this.n = n;
    }

    @Override
    public void run(){
        System.out.print(n + " ");
    }
}

public class Series{
    public static void main(String[] args) {
        
    }
}
