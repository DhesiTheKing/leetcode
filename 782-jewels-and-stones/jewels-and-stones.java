class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length(), c = 0;

        for(int i = 0; i < n; i++){
            if(jewels.indexOf(stones.charAt(i)) > -1) c++;
        }
        return c;
    }
}