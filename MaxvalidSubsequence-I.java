class Solution {
    public int maximumLength(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0)
                even++;
            else
               odd++;
        }
        int parity = nums[0]%2;
      int   ans = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]%2 == parity){
                continue;
            }else{
                ans ++;
                parity=nums[i]%2;
            }
        }
        return Math.max(ans,Math.max(even,odd));
    }
}
