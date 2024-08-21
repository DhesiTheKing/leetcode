class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char [] arr = s.toCharArray();
        int ans = 0;
        while(true){
        int check = 0;
        for(int i=0;i<arr.length-1;i++){
            if ( arr[i] == '0' &  arr[i+1] == '1'){
                arr[i] = '1';
                arr[i+1] = '0';
                check ++;
                i++;
            }
        }
        if ( check != 0 ) ans++;
        else break;
        }
        return ans;
    }
}