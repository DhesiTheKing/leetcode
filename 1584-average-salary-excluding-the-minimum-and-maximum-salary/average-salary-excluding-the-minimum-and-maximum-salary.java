class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<min) min=salary[i];
            if(salary[i]>max) max=salary[i];
        }
        double ans=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]==min || salary[i]==max) continue;
            ans+=salary[i];
        }
        return ans/(salary.length-2);
    }
}