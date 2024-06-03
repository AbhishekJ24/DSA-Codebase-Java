public class NQueens_Backtracking {
    public static boolean isSafe(char ch[][], int row, int col) {
        // vertically upwards
        for (int k = row - 1; k >= 0; --k) {
            if (ch[k][col] == 'Q')
                return false;
        }
        // left diagonally upwards
        for (int k = row - 1, kk = col - 1; k >= 0 && kk >= 0; --k, --kk) {
            if (ch[k][kk] == 'Q')
                return false;
        }
        // right diagonally upwards
        for (int k = row - 1, kk = col + 1; k >= 0 && kk < ch.length; --k, ++kk) {
            if (ch[k][kk] == 'Q')
                return false;
        }
        return true;
    }

    // static int count=0;
    // public static void nQueensCount(char ch[][], int row) {
    // if (row == ch.length) {
    // ++count;
    // return;
    // }
    // for (int col = 0; col < ch.length; col++) {
    // if (isSafe(ch, row, col)) {
    // ch[row][col] = 'Q';
    // nQueensCount(ch, row + 1);
    // ch[row][col] = 'X';
    // }
    // }
    // }

    public static void nQueens(char ch[][], int row) {
        if (row == ch.length) {
            printBoard(ch);
            return;
        }
        for (int col = 0; col < ch.length; col++) {
            if (isSafe(ch, row, col)) {
                ch[row][col] = 'Q';
                nQueens(ch, row + 1);
                ch[row][col] = 'X';
            }
        }
    }

    public static void printBoard(char ch[][]) {
        System.out.println("\n---------- CHESS  BOARD ----------\n");
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        char ch[][] = new char[n][n];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                ch[i][j] = 'X';
            }
        }
        nQueens(ch, 0);
        // nQueensCount(ch,0);
        // System.out.println(count);

    }
}