package Threads;

public class ColumnSum extends Thread {
    int[][] mat;
    int sum = 0, column;
    int m, n;

    ColumnSum(int[][] mat, int m , int n, int column){
        this.mat = mat;
        this.m = m;
        this.n = n;
        this.column = 0;
    }

    @Override
    public void run(){
        for (int i = 0; i < n; i++){
            sum += mat[i][column - 1];
        }
    }

    int getSum(){
        return sum;
    }
}
