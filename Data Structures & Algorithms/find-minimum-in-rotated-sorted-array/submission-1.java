class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                min = Math.min(nums[l], min);
                break;
            }

            int mid = l + (r - l) / 2;
            min = Math.min(nums[mid], min);

            if (nums[l] <= nums[mid]) {
                min = Math.min(nums[l], min);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return min;
    }
}
