class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        Map<Character, Integer> charIndexMap = new HashMap();

        while (right < s.length()) {
            char c = s.charAt(right);

            if (charIndexMap.containsKey(c)) {
                left = Math.max(left, charIndexMap.get(c) + 1);
            }

            maxLen = Math.max(maxLen, right - left + 1);
            charIndexMap.put(c, right);

            right++;
        }

        return maxLen;
    }
}
