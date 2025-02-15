class Solution {
    public int punishmentNumber(int n) {
        int res =0;
        for(int i=1; i<=n; i++){
            int prod = i*i;
            boolean ans = check(prod,i);
            if(ans==true){
                res+=prod;
            }
            
        }
       return res;
    }
    boolean check(int num , int i){
        if(num < i || i < 0){
          return false;
        }
      if(num == i)
          return true;
     return(check(num/10,i-(num%10)) ||check(num/100,i-(num%100)) || check(num/1000,i-(num%1000)));
        
    }
}