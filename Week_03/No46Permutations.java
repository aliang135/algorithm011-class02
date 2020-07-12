class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    int[] nums;
    int n;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.n = nums.length;

        permute(new ArrayList<Integer>(), 0);

        return result;
    }

    void permute(List<Integer> level, int first) {
        if (level.size() == n) {
            result.add(new ArrayList<>(level));
            return;
        }
        for (int num : nums) {
            if (level.contains(num)) {
                continue;
            }
            level.add(num);
            permute(level,num+1);
            level.remove(level.size()-1);

        }

    }
}