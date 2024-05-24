class Solution 
{
     public String longestPalindrome(String s) 
     {    
        int n = s.length();
       boolean[][] dp = new boolean[n][n];
        int count = 0, MaxLen = 0, si = 0;
        for (int gap = 0; gap < n; gap++) 
        {
            for (int i = 0, j = gap; j < n; i++, j++) 
            {
                if (gap == 0)
                    dp[i][j] = true;
                else if (gap == 1 && s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;
                else
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                if (dp[i][j]) 
                {
                    count++;
                    if (j - i + 1 > MaxLen) 
                    {
                        MaxLen = j - i + 1;
                        si = i;
                    }
                }
            }
        }
        return s.substring(si, si + MaxLen);
    }
}