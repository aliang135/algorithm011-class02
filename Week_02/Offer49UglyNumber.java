class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        long result = 1;
        priorityQueue.add(result);
        for (int i = 0; i < n; i++) {
            result = priorityQueue.poll();
            while (!priorityQueue.isEmpty() && priorityQueue.peek() == result) {
                priorityQueue.poll();
            }
            priorityQueue.add(result * 2);
            priorityQueue.add(result * 3);
            priorityQueue.add(result * 5);
        }

        return (int)result;
    }

    //////////////////////////
    /**
     public int nthUglyNumber(int n) {
     int a = 0, b = 0, c = 0;
     int[] ugly = new int[n];
     ugly[0] = 1;
     for (int i = 1; i < n; i++) {
     int n2 = ugly[a] * 2, n3 = ugly[b] * 3, n5 = ugly[c] * 5;
     ugly[i] = Math.min(Math.min(n2, n3), n5);
     if (ugly[i] == n2) a++;
     if (ugly[i] == n3) b++;
     if (ugly[i] == n5) c++;
     }

     return ugly[n - 1];
     }
     */
}