class Solution {
    public int maximumLength(int[] nums, int k) {
        int [][] dp = new int[k][k];
        int maxLen = 0;
        for(int num :nums){
            int curr_rem = num%k;
            for(int prev_rem = 0;prev_rem<k;prev_rem++){
                dp[prev_rem][curr_rem] = dp[curr_rem][prev_rem]+1;
                if(dp[prev_rem][curr_rem]>maxLen)
                    maxLen = dp[prev_rem][curr_rem];
            }
        }
        return maxLen;

    }
}
