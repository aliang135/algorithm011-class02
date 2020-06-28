import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = target - nums[i];
            if (!map.containsKey(j)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(j), i};
            }
        }

        return null;
    }
}