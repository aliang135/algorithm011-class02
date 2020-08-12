public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 0;
        int mark = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mark) != 0) {
                result++;
            }
            mark <<= 1;
        }

        return result;
    }
}