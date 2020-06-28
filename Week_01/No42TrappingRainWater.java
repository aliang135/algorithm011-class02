class Solution {
//    public int trap(int[] height) {
//        int sum = 0;
//        for (int i = 1; i < height.length - 1; i++) {
//            int maxLeft = 0;
//            for (int j = i - 1; j >= 0; j--) {
//                if (height[j] > maxLeft) {
//                    maxLeft = height[j];
//                }
//            }
//            int maxRight = 0;
//            for (int j = i + 1; j < height.length; j++) {
//                if (height[j] > maxRight) {
//                    maxRight = height[j];
//                }
//            }
//
//            int minLeftRight = Math.min(maxLeft, maxRight);
//
//            if (minLeftRight > height[i]) {
//                sum += minLeftRight - height[i];
//            }
//        }
//
//        return sum;
//    }

    public int trap(int[] height) {
        int sum = 0;
        int maxIndex = 0;
        int maxHeight = 0;

        //get the index of highest height
        for (int i = 0; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxIndex = i;
            }
        }
        //for the left part
        for (int left = 0; left < maxIndex; left++) {
            for (int i = left + 1; i <= maxIndex;
                 i++) {
                if (height[left] > height[i]) {
                    sum += height[left] - height[i];
                } else {
                    left = i;
                }
            }
        }
        //for the right part
        for (int right = height.length - 1; right > maxIndex; right--) {
            for (int i = right - 1; i >= maxIndex; i--) {
                if (height[right] > height[i]) {
                    sum += height[right] - height[i];
                } else {
                    right = i;
                }
            }
        }

        return sum;
    }
}