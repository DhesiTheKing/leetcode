class Solution {
    public int findChampion(int n, int[][] edges) {
        int ans[] = new int[n];
        for (int i=0 ; i<edges.length;i++){
            ans[edges[i][1]] = -1;
        }
        int count = 0;
        for (int i : ans){
            if ( i != -1) count++;
        }

        if (count!=1) return -1;
        for (int i=0;i<n;i++ ){
            if ( ans[i] != -1) return i; 
        }

        return -1;
    }
}