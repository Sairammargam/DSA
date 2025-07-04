class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length-1]-nums[0];
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(canPlace(nums,k,mid)){
                res = mid;
                low = mid+1;
            }else
              high = mid-1;         
        }
        return res;
    }
    public boolean canPlace(int [] nums,int k, int gap){
        int cows= 1;
        int last = nums[0];
        for(int i = 1;i<nums.length;i++){
            if((nums[i]-last)>=gap){
                cows++;
                last = nums[i];
            }
            if(cows == k)
               return true;
        }
        return false;
    }
}

