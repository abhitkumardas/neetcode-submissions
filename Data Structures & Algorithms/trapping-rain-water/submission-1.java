class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trap = 0;

        int lmax = 0;
        int rmax = 0;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (height[l] < height[r]) {
                if (lmax <= height[l]) {
                    lmax = height[l];
                } else {
                    trap += lmax - height[l];
                }
                l++;
            } else {
                if (rmax <= height[r]) {
                    rmax = height[r];
                } else {
                    trap += rmax - height[r];
                }
                r--;
            }
        }

        return trap;
    }
}
