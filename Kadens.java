class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int x : nums){
            sum+=x;
            if(sum>maxi)
               maxi = sum ;
             if(sum <0)
               sum = 0;
        }
        return maxi;
    }
}
