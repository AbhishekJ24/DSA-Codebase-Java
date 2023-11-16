public class practice{
    public static int checkIndexBinary(int num[], int target){
        int len=num.length;
        int start=0, end=len-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==target)
            return mid;
            else if(target<num[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={0,3,9,11,15,21};
        int index=checkIndexBinary(num, 3);
        if(index==-1)
        System.out.println("Not Found");
        else
        System.out.println("Found at index "+index);
    }
}