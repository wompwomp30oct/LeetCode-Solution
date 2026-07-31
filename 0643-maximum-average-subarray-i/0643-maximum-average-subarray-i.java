class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double msum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if( sum>msum) msum=sum;
        }
        return (msum/k);
    }
}