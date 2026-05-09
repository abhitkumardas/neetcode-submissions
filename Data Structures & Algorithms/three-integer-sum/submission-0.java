class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();

        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int m = i + 1;
            int k = n - 1;
            while (m < k) {
                int sum = num + nums[m] + nums[k];

                if (sum == 0) {
                    res.add(List.of(num, nums[m], nums[k]));

                    while (m < k && nums[m] == nums[m + 1]) m++;
                    while (m < k && nums[k] == nums[k - 1]) k--;

                    m++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    m++;
                }
            }
        }

        return res;
    }
}
