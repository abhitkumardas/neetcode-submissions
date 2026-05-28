class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (nums.length == 1 && target == nums[0]) {
            return 0;
        }

        while (l < r) {
            int mid = (l + r) / 2;
            System.out.println(r);

            if (target == nums[mid]) {
                return mid;
            }
            if (target == nums[l]) {
                return l;
            }
            if (target == nums[r]) {
                return r;
            }

            if (nums[mid] > nums[l]) {
                if (target > nums[l] && target < nums[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[l] || target<nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return -1;
    }
}
