package Arrays;

public class freqmorethan25 {
        public static int findSpecialInteger(int[] arr) {
            int l=arr.length;
            int brr[]=new int[arr[arr.length-1]+1];
            int threshold=(int)(0.25*l);
            for(int i=0;i<l;i++){
                brr[arr[i]]++;
            }
            for(int i=0;i<brr.length;i++){
                if(brr[i]>threshold)
                return i;
            }
            return -1;
        }
    public static void main(String[] args) {
        int arr[]={1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
}
