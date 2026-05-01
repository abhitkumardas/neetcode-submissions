class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap();
        for (int num : nums) freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        List<Integer>[] bucket = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entrySet : freqMap.entrySet()) {
            Integer key = entrySet.getKey();
            Integer val = entrySet.getValue();

            if (bucket[val] == null)
                bucket[val] = new ArrayList<>();

            bucket[val].add(key);
        }

        int[] res = new int[k];

        int resIndex = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (resIndex >= k) {
                break;
            }
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    if (resIndex >= k) {
                        break;
                    }
                    res[resIndex++] = num;
                }
            }
        }

        return res;
    }
}
