class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        for (int i : map.keySet()) {
            priorityQueue.add(i);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }

        return result;
    }
}