class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
        if(n==1) return true;
        int l=0;
        int me=0;
        while(me<=l && me<n){
            l=Math.max(l,me+nums[me]);
            me++;
            if(l>=n-1) return true;
        }
        return false;
    }
}