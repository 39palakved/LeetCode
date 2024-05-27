class Solution {
    public int[] sortByBits(int[] arr) {
       int ans[]= new int[arr.length];
        for(int i=0; i<arr.length;i++){
            ans[i]= countbit(arr[i])*10001+arr[i];
        }
        Arrays.sort(ans);
        for(int i=0; i<ans.length;i++){
            ans[i]= ans[i]%10001;
           
            
        }
         return ans;
    }
    private  int countbit(int n){
            int cnt =0;
            while(n!=0){
                cnt+=n&1;
                n>>=1;
            }
           return cnt; 
        }
        
        
        
    
}