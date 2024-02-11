package Array;
public class prefixsubarraysum {
    public static void main(String[] args) {
        int arr[]={1,-2,5,3,-1,0,8,7,-3,0};
        int pf_arr[]= new int[arr.length];
        pf_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pf_arr[i]=pf_arr[i-1]+arr[i];
        }
        
    }
}
