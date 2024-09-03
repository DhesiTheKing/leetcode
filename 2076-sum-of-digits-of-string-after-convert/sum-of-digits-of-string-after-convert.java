class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        String st = "";
        for ( char ch : s.toCharArray()){
            int num = (int)(ch - 'a')+1;
            st+=Integer.toString(num);
        }

        for(int i = 0; i<k ; i++){
            int temp = 0;
            for ( char ch : st.toCharArray() ){
                temp+=(int)(ch-48);
            }
            ans=temp;
            st=""+Integer.toString(temp);
            
        }

            return ans;
    }


}