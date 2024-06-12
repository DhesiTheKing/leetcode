class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int i:nums){
            if(i==0) count0++;
            else if (i==1)count1++;
            else count2++;
        }
        int i=0;
        for(int j=0;j<count0;j++){
            nums[i++]=0;
        }
        for(int j=0;j<count1;j++){
            nums[i++]=1;
        }
        for(int j=0;j<count2;j++){
            nums[i++]=2;
        }
    }
}