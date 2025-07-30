class Solution {
    public int longestSubarray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int maxAnd = Arrays.stream(nums).max().getAsInt();
        int maxLen = 0;
        int currLen = 0;
        for(int num : nums){
            if(num == maxAnd)
                  currLen++;
            else{
                maxLen = Math.max(maxLen,currLen);
                currLen = 0;
            }
        }
        return Math.max(maxLen,currLen);
    }
}
