import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    private List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        if (k > n) {
            return result;
        }

        LinkedList<Integer> list = new LinkedList<>();
        helper(n, k, list, 1);

        return result;
    }

    void helper(int n, int k, LinkedList<Integer> list, int first) {
        if (list.size() == k) {
            result.add(new LinkedList<>(list));
        }

        for (int i = first; i <= n; i++) {
            list.add(i);
            helper(n, k, list, i + 1);
            list.removeLast();
        }

    }
}