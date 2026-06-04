class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String convStr = new String(chars);

            if (anMap.containsKey(convStr)) {
                anMap.get(convStr).add(str);
            } else {
                anMap.put(convStr, new ArrayList(List.of(str)));
            }
        }

        return anMap.values().stream().toList();
    }
}
