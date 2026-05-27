class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numQ = new ArrayDeque<>();

        List<String> operations = List.of("+", "-", "*", "/");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (operations.contains(token)) {
                int a = numQ.pop();
                int b = numQ.pop();
                int r = calc(b, a, token);
                numQ.push(r);
            } else {
                numQ.push(Integer.parseInt(token));
            }
        }

        return numQ.pop();
    }

    private int calc(int a, int b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        } else if (operation.equals("-")) {
            return a - b;
        } else if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("/")) {
            return a / b;
        }
        return 0;
    }
}
