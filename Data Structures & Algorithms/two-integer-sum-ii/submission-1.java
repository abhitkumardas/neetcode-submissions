class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int m = 0;
        int k = n - 1;

        while (m < k) {
            int sum = numbers[m] + numbers[k];
            if (sum == target) {
                return new int[] {m+1, k+1};
            } else if (sum > target) {
                k--;
            } else {
                m++;
            }
        }

        return new int[] {-1, -1};
    }
}
