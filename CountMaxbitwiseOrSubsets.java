class Solution {
    // static int count = 0;
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for(int num : nums)
           maxOr|=num;
           int [] count = new int[1];
        backtrack(nums,0,0,maxOr,count);
      return count[0];
    }
    public void backtrack(int [] nums, int index, int currentOr,int maxOr,int [] count){
        if(currentOr == maxOr)
           count[0]++;
        for(int i = index;i<nums.length;i++){
            backtrack(nums,i+1,currentOr|nums[i],maxOr,count);
        }
        
    }


}
