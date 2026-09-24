class Solution {
    public int mySqrt(int x) {
        int start = 2, end = x / 2;

        if (x == 0 || x == 1)
            return x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start-1;
    }
}