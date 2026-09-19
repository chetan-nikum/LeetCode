class Solution {
    public int subtractProductAndSum(int n) {
        int rem, pro = 1, sum = 0;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            pro = pro * rem;
            sum = sum + rem;
        }
        return (pro - sum);
    }
}