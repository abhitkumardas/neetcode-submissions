class Solution {
    public void sortColors(int[] nums) {
        //  0 - low  : 0s
        // low - mid : 1s
        // mid-high  : 2s

        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                int t = nums[m];
                nums[m] = nums[l];
                nums[l] = t;

                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                int t = nums[m];
                nums[m] = nums[h];
                nums[h] = t;

                h--;
            }
        }
    }
}