class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = maxSum;

        for (int i = 1; i < n; i++) {
            currentSum += nums[i];
            currentSum = Math.max(currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
