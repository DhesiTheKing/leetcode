class Solution {

    static int powerCheck(int num){
        int ans=0;
        while(num!=1){
            if(num%2==0) num=num/2;
            else num=3*num+1;
            ans++;
        }

        return ans;
    }

    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int size=(hi-lo)+1;
        for(int i=0;i<size;i++){
            int val=powerCheck(hi);
            map.put(hi--,val);
        }

        List<Integer> al = new ArrayList<>(map.keySet());
        Collections.sort(al, (a,b) -> {
			
            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }
			
            return a - b;
        });
        
        return al.get(k-1);
    }
}