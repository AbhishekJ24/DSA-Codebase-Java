package Array;

public class MergeSort {
    public static int[] merge(int l[], int r[]) {
        int m[]=new int[l.length+r.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                m[k]=l[i];
                i++;
            }
            else{
                m[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<l.length){
            m[k++]=l[i++];
        }
        while(j<r.length){
            m[k++]=r[j++];
        }
        return m;
    }

    public static int[] mergeSort(int arr[]) {
        if (arr.length == 1)
            return arr;
        int left[]=new int[arr.length/2];
        for(int i=0;i<left.length;i++){
            left[i]=arr[i];
        }
        int right[]=new int[arr.length-arr.length/2];
        for(int i=arr.length/2;i<arr.length;i++){
            right[i-arr.length/2]=arr[i];
        }
        int newLeft[] = mergeSort(left);
        int newRight[] = mergeSort(right);
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 43, 2, 34, 25, 76, 98, 90, 34 };
        arr = mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
