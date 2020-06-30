class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Node> deque = new LinkedList<>();
        if (root == null) {
            return result;
        }
        deque.addLast(root);
        while (!deque.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = deque.size();
            for (int i = 0; i < n; i++) {
                Node node = deque.pollFirst();
                level.add(node.val);
                deque.addAll(node.children);
            }

            result.add(level);
        }

        return result;
    }
}