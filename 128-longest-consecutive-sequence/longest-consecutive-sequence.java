import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int curr = 1;
        long lastSmall = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == lastSmall + 1) {
                curr++;
                lastSmall = num;
            } else if (num != lastSmall) {
                curr = 1;
                lastSmall = num;
            }

            longest = Math.max(longest, curr);
        }

        return longest;
    }
}