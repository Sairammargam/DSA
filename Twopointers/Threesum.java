package Twopointers;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> a = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    List<Integer> inn = new ArrayList<>();
                    inn.add(nums[i]);
                    inn.add(nums[j]);
                    inn.add(nums[k]);
                    a.add(inn);
                    j++; k--;
                }
                else if(sum>target)
                      k--;
                else 
                      j++;
                
            }
        }
        ans.addAll(a);
        return ans;
        
    }
}