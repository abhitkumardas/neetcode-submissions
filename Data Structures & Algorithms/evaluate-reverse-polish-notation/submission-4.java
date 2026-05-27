class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numQ = new ArrayDeque<>();
        List<String> operations = List.of("+", "-", "*", "/");

        for (String token : tokens) {
            switch (token) {
                case ("+") -> {
                    numQ.push(numQ.pop() + numQ.pop());
                }
                case ("*") -> {
                    numQ.push(numQ.pop() * numQ.pop());
                }
                case ("-") -> {
                    int last = numQ.pop();
                    int secondLast = numQ.pop();
                    numQ.push(secondLast - last);
                }
                case ("/") -> {
                    int last = numQ.pop();
                    int secondLast = numQ.pop();
                    numQ.push(secondLast / last);
                }
                default -> {
                    numQ.push(Integer.parseInt(token));
                }
            }
        }

        return numQ.pop();
    }
}
