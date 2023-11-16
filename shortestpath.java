public class shortestpath{
    public static double shortestPathDisp(String path){
        double disp=0;
        int len=path.length();
        int x=0,y=0,i=0;
        while(i<len){
            if(path.charAt(i)=='N')
            x++;
            else if(path.charAt(i)=='S')
            x--;
            else if(path.charAt(i)=='E')
            y++;
            else if(path.charAt(i)=='W')
            y--;
            i++;

        }
        disp=Math.sqrt((x*x) + (y*y));
        return disp;
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestPathDisp(path));
    }
}