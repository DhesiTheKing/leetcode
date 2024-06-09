class Solution {
    public int totalMoney(int n) {
        int sum =0;
        int q = n/7;
        int r = n%7;
        int a =0;
        for(int i=0; i<q; i++){
            a = a+1;
            sum += (7*(2*a+6))/2;
        }
        for(int i=0; i<r; i++){
            a++;
            sum += a;
        }
        
        return sum;
    }
}