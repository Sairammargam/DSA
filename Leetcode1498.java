class Leetcode1498 {
    final int MOD = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int [] power = new int[n];
        power[0]=1;
        for(int i = 1;i<n;i++){
            power[i]=(power[i-1]*2)%MOD;
        }
        int left = 0, right = n-1,res = 0;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                res = (res+power[right-left])%MOD;
                left++;
            }
            else{
                right --;
            }
        }
        return res;
    }
}