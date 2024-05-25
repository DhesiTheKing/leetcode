class Solution {
    public String defangIPaddr(String address) {
       String[] arr=address.split("\\.");
       String ans="";
       for(int i=0;i<arr.length-1;i++){
        ans+=arr[i];
        ans+="[.]";
       }
    ans+=arr[arr.length-1];
       return ans;
    }
}