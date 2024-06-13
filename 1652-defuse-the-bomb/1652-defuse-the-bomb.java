class Solution {
    public int[] decrypt(int[] nums, int k) {
        int arr []= new int[nums.length];
        if(k==0){
          return new int[nums.length];
        }
        if(k>0){
        for(int i=0; i<nums.length;i++){
            int m=i+1;
            int sum =0;
            for(int j=1; j<=k; j++){
                if(m==nums.length){
                    m=0;
                }
                sum+=nums[m];
                m++;
            }
            arr[i]=sum;
        }
        }
        if(k<0){
            k=Math.abs(k);
        for(int i=0; i<nums.length;i++){
            int m=i-1;
            int sum =0;
          
            for(int j=1; j<=k; j++){
                if(m<0){
                    m=nums.length-1;
                }
                sum+=nums[m];
                m--;
            }
            arr[i]=sum;
        }
        }
        
        return arr;
    }
}