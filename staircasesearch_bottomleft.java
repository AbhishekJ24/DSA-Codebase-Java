public class staircasesearch_bottomleft {
    public static void search(int mat[][], int key) {
        int row = mat.length - 1;
        int col = 0;
        while (row >= 0 && col < mat[0].length) {
            if (key == mat[row][col]) {
                System.out.println("Key found at index (" + row + "," + col + ")");
                break;
            } else if (key > mat[row][col])
                col++;
            else
                row--;
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 35;
        search(mat, key);
    }
}
