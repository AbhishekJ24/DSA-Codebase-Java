// package Backtracking;

// public class Sudoku_Backtracking {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit_place) {
//         // row
//         for (int j = 0; j < 9; j++) {
//             if (sudoku[row][j] == digit_place)
//                 return false;
//         }
//         // column
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[i][col] == digit_place)
//                 return false;
//         }
//         // grid
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;
//         for (int i = 0; i < sr + 3; i++) {
//             for (int j = 0; j < sc + 3; j++) {
//                 if (sudoku[i][j] == digit_place)
//                     return false;
//             }
//         }
//         return true;
//     }

//     public static boolean solveSudoku(int sudoku[][], int row, int col) {

//         if(row==9 && col==9)
//         return true;

//         else if(row==9)
//         return false;
        

//         int nextRow = row, nextCol = col + 1;
//         if (sudoku[row][col] != 0) {
//             return solveSudoku(sudoku,nextRow,nextCol);
//         }
//         for (int digit_place = 0; digit_place < 9; digit_place++) {
//                 if (isSafe(sudoku, row, col, digit_place)) {
//                     solveSudoku(sudoku, nextRow, nextCol);
//                 }
//             }
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for (int i = 0; i < sudoku.length; i++) {
//             for (int j = 0; j < sudoku.length; j++) {
//                 System.out.print(sudoku[i][j]);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int[][] sudoku = {
//                 { 0, 4, 0, 0, 0, 0, 0, 6, 7 },
//                 { 0, 2, 0, 4, 0, 3, 8, 0, 0 },
//                 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//                 { 8, 6, 0, 0, 0, 0, 0, 0, 0 },
//                 { 0, 0, 2, 0, 1, 0, 4, 0, 0 },
//                 { 0, 0, 0, 0, 0, 0, 0, 7, 9 },
//                 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//                 { 0, 0, 4, 8, 0, 1, 0, 9, 0 },
//                 { 9, 1, 0, 0, 0, 0, 0, 5, 0 }
//         };
//         System.out.println(solveSudoku(sudoku, 0, 0));
//         printSudoku(sudoku);

//     }
// }