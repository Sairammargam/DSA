class Solution {
    public int maxSum(int[] nums) {
            int mx = Integer.MIN_VALUE;
            Set<Integer> st = new HashSet<>();
            int sum = 0;
            for(int val : nums){
                if(!st.contains(val)){
                    if(val>=0)
                        sum+=val;
                    else 
                       mx = Math.max(mx,val);
                }
                st.add(val);
            }
            if(sum == 0 && !st.contains(0))
                 return mx;
            return sum;
    }
}
