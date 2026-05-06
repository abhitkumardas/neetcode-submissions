class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        int[] seen = new int[256];

        for (int i = 0; i < 256; i++) seen[i] = -1;

        while (right < s.length()) {
            char c = s.charAt(right);

            if (seen[c] >= 0) {
                left = Math.max(left, seen[c] + 1);
            }

            maxLen = Math.max(maxLen, right - left + 1);

            seen[c] = right;
            right++;
        }

        return maxLen;
    }
}
