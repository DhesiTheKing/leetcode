class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
       int i=0,j=0;
       while(i<str2.length() && j<str1.length()){
        char next = (char)(str1.charAt(j)+1);
        char ch = str1.charAt(j) == 'z' ? 'a' : next;
        
        if(str1.charAt(j)==str2.charAt(i) || ch==str2.charAt(i)){
            j++;
            i++;

        }
        else j++;
       }

       if (i==(str2.length())) return true;
       return false; 
    }
}