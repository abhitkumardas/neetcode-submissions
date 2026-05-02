class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            int[] chArr = new int[100];
            for(char ch: str.toCharArray()){
                chArr[ch - 'a']++;
            }

            String key = Arrays.toString(chArr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
