import java.util.*;
public class question {
    public static void processArray(int arr[],int len){
        ArrayList<Integer> out = new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]>=0 && arr[i]<=100){
                out.add(arr[i]);
            }
            else if(arr[i]>100){
                count++;
            }
        }
        for (int i : out) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        int i=0;
        int count=0;
        boolean check=true;
        while(check)
        {
            nums[i]=sc.nextInt();
            if(nums[i]==-1){
                check=false;
            }
            ++count;
        }
        processArray(nums,count);
    }
}
