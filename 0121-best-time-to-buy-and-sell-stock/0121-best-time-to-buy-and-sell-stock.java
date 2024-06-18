class Solution {
    public int maxProfit(int[] p) {
       int buy=p[0];
        int max =0;
        for(int i=1; i<p.length;i++){
            if(p[i]<buy){
                buy=p[i];
            }
            max = Math.max(max, p[i]-buy);
        }
        return max;
    }
}