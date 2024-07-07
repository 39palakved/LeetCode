class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]= new int[2];
        if(n>1){
            int h =n-1;
            int k=1;
            int cnt =0;
      
            while(cnt==0){
            String s = Integer.toString(h);
         String s2 = Integer.toString(k);
             if(s.indexOf('0')==-1 && s2.indexOf('0')==-1){
                 arr[0]=h;
                 arr[1]=k;
                cnt++;
               
             }
             else{
                 h--;
                 k++;
             }
             
             
         }
        }
        return arr;
        
    }
}