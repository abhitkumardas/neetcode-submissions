class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;
        for (int num : numSet) {
            int cLen = 0;
            if (!numSet.contains(num + 1)) {
                int x = num;
                while (numSet.contains(x)) {
                    cLen++;
                    x--;
                }
            }
            maxLen = Math.max(cLen, maxLen);
        }

        return maxLen;
    }
}
