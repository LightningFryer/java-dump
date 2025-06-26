package Threads;

public class SecondarySum extends Thread {
    int[][] mat;
    int sum = 0
    int m, n;

    SecondarySum(int[][] mat, int m , int n){
        this.mat = mat;
        this.m = m;
        this.n = n;
    }

    @Override
    public void run(){
        for (int i = 0; i < m; i++){
            sum += mat[i][n - i -1];
        }
    }

    int getSum(){
        return sum;
    }
}
