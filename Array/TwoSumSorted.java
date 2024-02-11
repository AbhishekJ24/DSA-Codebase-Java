package Array;
public class TwoSumSorted{
    public static int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;
        while(lp<rp){
            if(numbers[lp]+numbers[rp]==target){
                break;
            }
            else if(numbers[lp]+numbers[rp]<target)
            lp++;
            else
            rp--;
        }
        return new int[] {lp+1, rp+1};
    }
    public static void main(String[] args) {
        int arr[]={1,2,12,13,14,20};
        int idx[]=twoSum(arr,25);
        System.out.println(idx[0]);
        System.out.println(idx[1]);
    }
}

// INTUITION

// The problem statement tells us that the array is 1-indexed. We need to find two indices in the array numbers whose values/data sums up to target, which is given as the input alongside the array numbers. There are multiple ways of solving this problem.

// APPROACH

// I have used the double pointer approach which also forms the basis of Modulo Arithmetic for the advanced version of this question where the array is not only sorted but also rotated at a an arbitrary position k. To solve this, we use two pointer, one is the left pointer, pointing at the starting index, i.e. initially 0 and one right pointer, which starts at index numbers.length-1. We have to implement a while loop which runs until left pointer is less than right pointer. Inside the while loop, we check if the data on the indices sums up to target, if the indices are found, we store the indices in an auxiliary array indices of size 2 with an increment of 1 because of the 1-indexed condition. If the data on the indices doesn't sum up to target, we check if its less than the target or greater than, if its less than the target, we increment the left pointer, otherwise, we decrement the right pointer. This pointer approach is applicable in case of sorted array only.