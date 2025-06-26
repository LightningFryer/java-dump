package Threads;

public class CheckMatrix extends Thread {
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
