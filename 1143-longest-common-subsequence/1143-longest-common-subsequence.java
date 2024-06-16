class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        int cnt=0;
        int n = str1.length();
        int m = str2.length();
        int dp[][]= new int[n+1][m+1];
        int len=0;
        for(int i=1; i<=n;i++){
          
           for(int j=1; j<=m;j++){
                 len =0;
               if(str1.charAt(i-1)==str2.charAt(j-1)){
                   len = 1+dp[i-1][j-1];
                   
               }
               else{
                   len = Math.max(dp[i-1][j],dp[i][j-1]);
               }
               dp[i][j]=len;
           }
               
           }
            
        return dp[n][m];
    }
}