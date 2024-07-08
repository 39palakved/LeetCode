class Solution {
    public int diagonalSum(int[][] mat) {
       int n= mat.length-1;
       int sum =0;
        for(int i=0; i<=n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i];
        }
        int odd =0;
        if(n%2==0){
           odd = mat[n/2][n/2] ;
            sum-=odd;
        }
        return sum;
        
    }
}