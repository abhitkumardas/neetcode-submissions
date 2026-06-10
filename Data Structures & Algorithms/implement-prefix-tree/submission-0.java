class PrefixTree {
    public class TrieNode {
        private final TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isEndOfWord = false;
        }
    }

    private final TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if (word == null) {
            return;
        }

        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';

            if (index < 0 || index >= 26) {
                throw new IllegalArgumentException("Only lowercase English letters allowed.");
            }

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        if (word == null) {
            return false;
        }

        TrieNode res = traverseTo(word);

        return res != null && res.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        if (prefix == null) {
            return false;
        }

        return traverseTo(prefix) != null;
    }

    private TrieNode traverseTo(String str) {
        TrieNode current = root;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';

            if (index < 0 || index >= 26 || current.children[index] == null) {
                return null;
            }

            current = current.children[index];
        }

        return current;
    }
}
