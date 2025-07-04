public class Solution {
    public int findPages(int[] nums, int m) {
        if (m > nums.length) return -1; // Edge case check

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        int low = max;
        int high = sum;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(nums, mid);

            if (students <= m) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public int countStudents(int[] nums, int maxPagesPerStudent) {
        int students = 1;
        int pages = 0;

        for (int pagesInBook : nums) {
            if (pages + pagesInBook <= maxPagesPerStudent) {
                pages += pagesInBook;
            } else {
                students++;
                pages = pagesInBook;
            }
        }

        return students;
    }
}

