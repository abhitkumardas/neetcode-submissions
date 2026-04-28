class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n)
            return false;

        int[] charOcc = new int[128];

        for (int i = 0; i < m; i++) {
            charOcc[s.charAt(i)] = charOcc[s.charAt(i)] + 1;
            charOcc[t.charAt(i)] = charOcc[t.charAt(i)] - 1;
        }

        for (int i = 0; i < 128; i++) {
            if (charOcc[i] != 0)
                return false;
        }

        return true;
    }
}
