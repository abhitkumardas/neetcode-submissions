class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap();

        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sortedStr = new String(temp);

            if (anagramMap.containsKey(sortedStr)) {
                List<String> existingStrings = anagramMap.get(sortedStr);
                existingStrings.add(str);

                anagramMap.put(sortedStr, existingStrings);
            } else {
                List<String> newElement = new ArrayList();
                newElement.add(str);
                anagramMap.put(sortedStr, newElement);
            }
        }

        return new ArrayList(anagramMap.values());
    }
}
