class Solution {
public void wiggleSort(int[] nums) {

Arrays.sort(nums);

int n=nums.length;

int[] c = new int[nums.length];

int a=(n - 1) / 2,b=n-1;

for(int i=0;i<n;i++){

if(i%2==0){

c[i]=nums[a];
a--;

}
else{

c[i]=nums[b];
b--;

}

}

for(int i=0;i<n;i++){

nums[i]=c[i];

}

}
}