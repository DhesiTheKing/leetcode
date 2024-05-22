class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(i%2==0) map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.size()==0) return -1;
        int ans=0;
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            ans=Math.max(ans,mp.getValue());
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getValue()==ans) list.add(mp.getKey());
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            min=Math.min(min,list.get(i));
        }
        return min;

    }
}