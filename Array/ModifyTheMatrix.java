package Array;

public class ModifyTheMatrix {
    public void modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = matrix[j][i] == -1 ? max : matrix[j][i];
            }
        }
    }
}