class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> open = new ArrayDeque();
        Deque<Integer> star = new ArrayDeque();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                open.push(i);
            } else if (c == '*') {
                star.push(i);
            } else {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while (!open.isEmpty() && !star.isEmpty()) {
            if (open.peek() > star.peek()) {
                return false;
            }

            open.pop();
            star.pop();
        }

        return open.isEmpty();
    }
}
