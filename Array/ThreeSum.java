package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0)
                break;
            int j = i + 1;
            int k = l - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j + 1 <= k && nums[j] == nums[j + 1])
                        j++;
                    j++;
                    k--;
                }
            }
            while (i + 1 < l && nums[i + 1] == nums[i])
                i++;
        }
        return ans;
    }
}