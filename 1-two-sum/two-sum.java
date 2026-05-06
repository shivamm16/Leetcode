class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tbf = target - nums[i];
            if (mp.containsKey(tbf))
                return new int[] { mp.get(tbf), i };
            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}