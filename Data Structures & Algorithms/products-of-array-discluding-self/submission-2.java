class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefixArry = new int[n];
        int[] sufixArry = new int[n];

        prefixArry[0] = 1;
        sufixArry[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefixArry[i] = prefixArry[i - 1] * nums[i - 1];
            sufixArry[n - i - 1] = sufixArry[n - i] * nums[n - i];
        }

        int[] res = new int[n];

        for (int m = 0; m < n; m++) {
            res[m] = prefixArry[m] * sufixArry[m];
        }

        return res;
    }
}
