class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            int num = entry.getKey();
            int f = entry.getValue();
            if (freq[f] == null) {
                freq[f] = new ArrayList();
            }
            freq[f].add(num);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i >= 0 && index < k; i--) {
            if (freq[i] != null) {
                for (int num : freq[i]) {
                    res[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
