class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            int num1=nums[i];
            int num2=nums[n+i];
            ans[j++]=num1;
            ans[j++]=num2;
        }
        return ans;
    }
}