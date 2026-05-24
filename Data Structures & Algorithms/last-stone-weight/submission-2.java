class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int num : stones) {
            pq.offer(num);
        }

        while (pq.size() > 1) {
            int a = Math.abs(pq.poll() - pq.poll());
            if (a > 0)
                pq.offer(a);
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
