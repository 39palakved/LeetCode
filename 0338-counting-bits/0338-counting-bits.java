class Solution {
    public int[] countBits(int n) {
     int arr[]= new int [n+1];
    
    for(int i=0; i<=n ; i++){

        int m=i;
        int cnt =0;
         while(m!=0){
            cnt+=(m&1);
            m = m>>1;
         }
         arr[i]= cnt;
    }
    return arr;
 
}
}



        

























    
    

