class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int num1=0;
        int num2=1;
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=num1+num2;
            num1=num2;
            num2=ans;
        }
        return ans;
    }
}