package Array;

public class specialpositionsbinarymatrix{
    public static boolean rowCheck(int[][] mat,int x, int y){
        int c=0;
        for(int i=0;i<y;i++){
            if(mat[x][i]==0)
            c++;
        }
        for(int i=y+1;i<mat[0].length;i++){
            if(mat[x][i]==0)
            c++;
        }
        if(c==mat[0].length-1)
        return true;
        else
        return false;
    }
    public static boolean colCheck(int[][] mat,int x, int y){
        int c=0;
        for(int i=0;i<x;i++){
            if(mat[i][y]==0)
            c++;
        }
        for(int i=x+1;i<mat.length;i++){
            if(mat[i][y]==0)
            c++;
        }
        if(c==mat.length-1)
        return true;
        else
        return false;
    }
    public static int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && rowCheck(mat,i,j) && colCheck(mat,i,j))
                ++count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int mat[][]={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(mat));
    }
}