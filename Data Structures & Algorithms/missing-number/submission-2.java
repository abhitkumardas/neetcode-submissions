class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            numSet.add(num);
            if (min > num)
                min = num;
            if (max < num)
                max = num;
        }

        int a = min + 1;
        while (a < max) {
            if (!numSet.contains(a))
                return a;
            a++;
        }

        return min==0? max+1:0;
    }
}
