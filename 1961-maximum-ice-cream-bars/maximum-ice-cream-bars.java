class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0;
        for(int i:costs){
            if (i>coins) return ans;
            if(i<=coins){
                ans++;
                coins-=i;
            }
        }
        return ans;
    }
}