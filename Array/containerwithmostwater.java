package Array;

public class containerwithmostwater {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0, rp = height.length - 1;
        while (lp < rp) {
            int width = 1 * Math.abs(lp - rp);
            int heig = Math.min(height[lp], height[rp]);
            int max = width * heig;
            if (maxWater < max)
                maxWater = max;
            if (height[lp] < height[rp])
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
}