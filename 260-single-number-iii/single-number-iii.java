class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans=new int[2];
        int size=0;
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getValue()==1) ans[size++]=mp.getKey();
        }
        return ans;
    }
}