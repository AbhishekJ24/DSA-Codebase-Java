package Array;

public class diiferencebetweenzerosandonesincolumn {
    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int diff[][] = new int[m][n];
        int onesRow[] = new int[m];
        int zerosRow[] = new int[m];
        int onesCol[] = new int[n];
        int zerosCol[] = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
                if (grid[i][j] == 0) {
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int grid[][] = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
        int diff[][] = onesMinusZeros(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(diff[i][j] + "\t");
            }
            System.out.println();
        }
    }
}