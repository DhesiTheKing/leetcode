class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ansLength=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[]=new int[map.size()];
        int i=0;
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            arr[i++]=mp.getValue();
        }
        i=0;
        Arrays.sort(arr);
        int max=arr[arr.length-k];
        int[] ans=new int[k];
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getValue()>=max){
                ans[i++]=mp.getKey();
                if(i>k) break;
            } 
        }
        return ans;
    }
}