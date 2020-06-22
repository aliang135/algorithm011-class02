class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> temp = new HashMap<>();

        int  j =0;
        for(int i =0;i<nums.length;i++ ){
            j=target-nums[i];
            if(temp.containsKey(j)){
                return new int[]{temp.get(j),i};
            }else{
                temp.put(nums[i],i);
            }
        }

        return null;
    }
}
