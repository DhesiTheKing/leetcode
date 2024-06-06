class Solution {
    public int minPartitions(String n) {
        char ans = '0';
        for (char ch : n.toCharArray())
            if (ch > ans) ans = ch;
        return ans - '0';
    }
}