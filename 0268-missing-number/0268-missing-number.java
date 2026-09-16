class Solution {
    public int missingNumber(int[] nums) {
                int  n=nums.length;
        long sum=0;
        
        //sum of elements of array
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        
        long Tsum= (((long)(n)*(n+1))/2); //sum of n natural number
        
        return (int)(Tsum-sum);
    }
}