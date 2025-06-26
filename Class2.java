package Threads;

class CheckMatrix extends Thread{
    int[][] mat;
    boolean isUnique = true;
    int m, n;

    CheckMatrix(int[][] mat, int m , int n){
        this.mat = mat;
        this.m = m;
        this.n = n;
    }

    @Override
    public void run(){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int check = mat[i][j];
                for (int a = 0; a < m; a++){
                    for (int b = 0; b < n; b++){
                        if (check == mat[a][b]){
                            isUnique = false;
                            break;
                        }
                    }
                }
            }
        }
    }

    boolean check(){
        return isUnique;
    }
}

class RowSum extends Thread{
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

class ColumnSum extends Thread{
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

class PrincipalSum extends Thread{
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

class SecondarySum extends Thread{
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

public class ThreadDemo {
    public static void main(String[] args) {
        
    }
}


