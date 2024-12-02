class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] arr = sentence.split(" ");
        for ( int i = 0 ; i<arr.length; i++){
            if(arr[i].contains(searchWord) && arr[i].length()>=searchWord.length()){
                boolean flag = true;
                for ( int j = 0; j<searchWord.length() ; j++){
                    if (searchWord.charAt(j) != arr[i].charAt(j)) flag = false;
                }
                if (flag) return i+1;
            }
        }
        return -1;
    }
}