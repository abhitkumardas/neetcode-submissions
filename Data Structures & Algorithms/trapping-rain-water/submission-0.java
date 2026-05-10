class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int trap = 0;

        int lMax = 0;
        int rMax = 0;

        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (height[l] < height[r]) {
                if (lMax <= height[l]) {
                    lMax = height[l];
                } else {
                    trap += lMax - height[l];
                }

                l++;
            } else {
                if (rMax <= height[r]) {
                    rMax = height[r];
                } else {
                    trap += rMax - height[r];
                }

                r--;
            }
        }

        return trap;
    }
}
