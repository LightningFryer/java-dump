package Threads;

public class PrincipalSum extends Thread {
    int[][] mat;
    int sum = 0
    int m, n;

    PrincipalSum(int[][] mat, int m , int n){
        this.mat = mat;
        this.m = m;
        this.n = n;
    }

    @Override
    public void run(){
        for (int i = 0; i < m; i++){
            sum += mat[i][i];
        }
    }

    int getSum(){
        return sum;
    }
}
