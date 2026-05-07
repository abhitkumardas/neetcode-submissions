class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toCharArray();
        int n = charArr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(charArr[left])) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(charArr[right])) {
                right--;
                continue;
            }

            char l = Character.toLowerCase(charArr[left]);
            char r = Character.toLowerCase(charArr[right]);

            if (l != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
