class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[52];
        for(char c:s.toCharArray()){
            if(c>='A' && c<='Z') arr[26+(c-'A')]++;
            else arr[c-'a']++;
        }
        int count=0;
        for(int i=0;i<52;i++){
            if(arr[i]%2!=0) count++;
        }
        if(count==0) return s.length();

        return s.length()-count+1;
    }
}