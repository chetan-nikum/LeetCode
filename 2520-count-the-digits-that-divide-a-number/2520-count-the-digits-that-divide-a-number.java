class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0, rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            if (n % rem == 0)
                count++;
        }
        return count;
    }
}