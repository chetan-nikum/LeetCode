class Solution {
    public boolean isPalindrome(int x) {
        int rem,rev=0;
        int y=x;
        while(y>0){
            rem=y%10;
            y=y/10;
            rev=rev*10+rem;
        }
        if(rev==x)
        return true;
    return false;
    }
}