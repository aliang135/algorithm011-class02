class Solution {
    public int numDecodings(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int[] dp = new int[length];
        char[] chars = s.toCharArray();
        if (chars[0] == '0') {
            return 0;
        }
        dp[0] = 1;

        for (int i = 1; i < length; i++) {
            if (chars[i] != '0') {
                dp[i] = dp[i - 1];
            }

            int num = 10 * (chars[i - 1] - '0') + (chars[i] - '0');
            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[length - 1];
    }
}