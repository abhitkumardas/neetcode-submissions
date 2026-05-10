class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        int l = 0;
        int r = n - 1;
        while (l < r) {
            int h = Math.min(heights[l], heights[r]);
            int w = r - l;

            int area = h * w;
            maxArea = Math.max(area, maxArea);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
