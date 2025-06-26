package leetcode.SetMatrixZeroes;
import java.util.*;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> zeroIndexAL = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    zeroIndexAL.add(new int[] {i, j});
                }
            }
        }

        for (int[] arr: zeroIndexAL){
            for (int i = 0; i < matrix[0].length; i++){
                matrix[arr[0]][i] = 0;
            }

            for (int i = 0; i < matrix.length; i++){
                matrix[i][arr[1]] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SetMatrixZeroes sol = new SetMatrixZeroes();

        int[][] matrix1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        System.out.println("Original matrix 1:");
        printMatrix(matrix1);
        sol.setZeroes(matrix1);
        System.out.println("After setZeroes:");
        printMatrix(matrix1);

        System.out.println("Original matrix 2:");
        printMatrix(matrix2);
        sol.setZeroes(matrix2);
        System.out.println("After setZeroes:");
        printMatrix(matrix2);
    }
}
