class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> ans = new HashMap();
        for(int i = 0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        List<Integer> major = new ArrayList<>();
        int threeshold = nums.length/3;
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            int ele = entry.getKey();
            int val  = entry.getValue();
            if(val > threeshold){
                major.add(ele);
            }
        }
        return major;
    }
}
