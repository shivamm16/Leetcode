class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int digits=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            if(banned[i]<=n && banned[i]>=1){
                set.add(banned[i]);
            }
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(sum+i>maxSum){
                    break;
                }
                else{
                    sum+=i;
                    digits++;
                }
            }
        }
        return digits;
    }
}