package Twopointers;
class sortColors{
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    void mergeSort(int[] nums, int l, int h) {
        if (l < h) { 
            int m = l + (h - l) / 2;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, h);
            merge(nums, l, m, h);
        }
    }

    void merge(int[] nums, int l, int m, int h) {
        int[] temp = new int[h - l + 1]; 
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= h) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= m) {
            temp[k++] = nums[i++];
        }

        while (j <= h) {
            temp[k++] = nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            nums[l + x] = temp[x];
        }
    }
}

