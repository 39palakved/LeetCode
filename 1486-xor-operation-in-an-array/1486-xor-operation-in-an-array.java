class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        int res=0;
        
        
        while(i<n){
        res = res^start; 
            i++;
            start+=2;
        }
        return res;
    }
}