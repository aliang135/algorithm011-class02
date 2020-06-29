class Solution {
//   public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for (char c : t.toCharArray()) {
//            if (map.get(c) == null) {
//                return false;
//            }
//            map.put(c, map.get(c) - 1);
//            if (map.get(c) < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
    public boolean isAnagram(String s, String t) {
        int[] nums = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
            nums[t.charAt(i) - 'a']--;
        }
        for (int i : nums){
            if (i != 0)
                return false;
        }

        return true;
    }
}