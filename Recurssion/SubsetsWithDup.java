class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        helper(nums,0,new ArrayList<>(),st);
         for(List<Integer> it : st)
             ans.add(it);
        return ans;
    }
    public void helper(int [] nums, int idx, List<Integer> p, Set<List<Integer>> ans){
        if(idx == nums.length){
        
            ans.add(new ArrayList<>(p));
            return;
        }
        p.add(nums[idx]);
        helper(nums,idx+1,p,ans);
        p.remove(p.size()-1);
        helper(nums,idx+1,p,ans);
    }
}
