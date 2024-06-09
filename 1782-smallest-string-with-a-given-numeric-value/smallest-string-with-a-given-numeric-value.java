class Solution {
    public String getSmallestString(int n, int k) {
        char[] list = new char[n];
        k -= n;
        for (int i = n - 1; i >= 0 ; i--) {
            if (k > 25) {
                k -= 25;
                list[i] = 'z';
            } else {
                list[i] = (char)(97 + k);
                k = 0;
            }
        }
        return String.valueOf(list);
    }
}