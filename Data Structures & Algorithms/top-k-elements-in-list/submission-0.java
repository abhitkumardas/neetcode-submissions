class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> numMap = new HashMap();

        for (int num: nums){
            numMap.put(num, numMap.getOrDefault(num, 0)+1);
        }

        List<Map.Entry<Integer,Integer>> list= new ArrayList(numMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] res= new int[k];
        for(int i=0; i<k; i++){
            res[i] = list.get(i).getKey();
        }

        return res;
        
    }
}
