class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ck=nums.length/3;
        ArrayList<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()>ck){
                list.add(mp.getKey());
            }
        }
        return list;
    }
}