class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int first = firstOccur(nums,l,h,target);
        if(first==-1){
            return new int[] {-1,-1};
        }
        int last = lastOccur(nums,l,h,target);
        return new int[] {first,last};
    }
    public int firstOccur(int [] nums, int low , int high, int target){
        int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else
               high = mid-1;
        }
        return first;
    }

    public int lastOccur(int [] nums , int low , int high , int target){
        int last = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid]<target)
                low = mid+1;
            else
               high = mid-1;
        }
        return last;
    }
}
