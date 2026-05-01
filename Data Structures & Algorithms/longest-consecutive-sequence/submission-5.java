class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet();

        for (int num : nums) numSet.add(num);

        int maxLen = 0;
        for (int num : nums) {
            int a = num+1;
            int curLen = 1;
            while (numSet.contains(a)) {
                curLen++;
                a++;
                
            }

            if(maxLen< curLen) maxLen=curLen;
        }

        return maxLen;
    }
}
