class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else {
                if (charStack.isEmpty())
                    return false;

                char top = charStack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{')
                    || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}
