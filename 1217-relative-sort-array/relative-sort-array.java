class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
        int ans[]=new int[arr1.length];
        for(int num:arr2){
           if( map.containsKey(num)){
            for(int j=0;j<map.get(num);j++){
                ans[i++]=num;
            }
            map.remove(num);
           }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:arr1){
           if(map.containsKey(num)){
                int size=map.get(num);
                for(int j=0;j<size;j++){
                    list.add(num);
                }
            map.remove(num);
           }
        }
        Collections.sort(list);
        for(int k=0;k<list.size();k++){
            ans[i++]=list.get(k);
        }
        return ans;


    }
}