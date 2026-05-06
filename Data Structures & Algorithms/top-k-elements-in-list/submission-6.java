class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numOccMap = new HashMap();

        for (int num : nums) numOccMap.put(num, numOccMap.getOrDefault(num, 0) + 1);

        List<Integer>[] freq = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : numOccMap.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (freq[val] == null) {
                freq[val] = new ArrayList<>();
            }
            freq[val].add(key);
        }

        int[] res = new int[k];
        int resIndex = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            if (resIndex >= k)
                break;

            if (freq[i] != null) {
                List<Integer> fVal = freq[i];

                for (int j = 0; j < fVal.size(); j++) {
                    if (resIndex >= k)
                        break;

                    res[resIndex++] = fVal.get(j);
                }
            }
        }

        return res;
    }
}
