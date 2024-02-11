package Array;

public class imagesmoother {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (0 <= x && x < m && 0 <= y && y < n) {
                            sum += img[x][y] % 256;
                            count += 1;
                        }
                    }
                }
                img[i][j] += (sum / count) * 256;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] /= 256;
            }
        }
        return img;
    }
    public static void main(String[] args) {
        int img[][]={{100,200,100},{200,50,200},{100,200,100}};
        imagesmoother ob = new imagesmoother();
        int smooth[][]=ob.imageSmoother(img);
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                System.out.print(smooth[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
