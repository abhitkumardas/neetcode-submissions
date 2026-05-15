class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] chArr = s.toCharArray();

        Deque<Character> charStack = new ArrayDeque<>();
        for (char c : chArr) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if ((c == ')' || c == '}' || c == ']')) {
                if (charStack.isEmpty())
                    return false;

                if (c == ')' && charStack.peek() != '(') {
                    return false;
                } else if (c == '}' && charStack.peek() != '{') {
                    return false;
                } else if (c == ']' && charStack.peek() != '[') {
                    return false;
                }

                charStack.poll();
            }
        }

        return charStack.isEmpty();
    }
}
