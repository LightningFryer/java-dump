package Threads;

public class RowSum extends Thread {
    int[][] mat;
    int sum = 0, row;
    int m, n;

    RowSum(int[][] mat, int m , int n, int row){
        this.mat = mat;
        this.m = m;
        this.n = n;
        this.row = 0;
    }

    @Override
    public void run(){
        for (int i = 0; i < n; i++){
            sum += mat[row - 1][i];
        }
    }

    int getSum(){
        return sum;
    }
}
