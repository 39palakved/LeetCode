
      class Solution {
    public int climbStairs(int n) {
        return helper(0,1,n);
    }
    public int helper (int x, int y, int n){
        return --n == 0 ? x+y : helper(y,x+y,n);
    }
}  
    