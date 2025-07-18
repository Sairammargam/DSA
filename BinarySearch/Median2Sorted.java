class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1>n2)
           return findMedianSortedArrays(nums2,nums1);
        int n = n1+n2;
        int left = (n1+n2+1)/2;
        int low = 0, high = n1;
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2 = left-mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE,r1 = Integer.MIN_VALUE,r2 = Integer.MIN_VALUE;
            if(mid < n1)
                r1 = nums1[mid1];
            if(mid2<n2)
              r2 = nums2[mid2];
            if(mid1-1>=0)
                l1 = nums1[mid1-1];
            if(mid2 - 1>=0)
             l2 = nums2[mid2-1];
             
        }
    }
}
