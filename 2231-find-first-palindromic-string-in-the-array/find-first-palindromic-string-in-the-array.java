class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for (int i = 0 ; i < words.length ; i++){
            int start = 0, end =words[i].length()-1;
            while(start<end){
                if(words[i].charAt(start)==words[i].charAt(end)){
                    start++;
                    end--;
                }
                else break;
            }
            // System.out.println("word :"+words[i]+" start: "+start+" end: "+end);
            if(start>=end || (words[i].length()==2 && start>end)){
                ans = words[i];
                break;
            } 
        }
        return ans;
    }
}