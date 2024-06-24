class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a1[]= new int[nums.length/2];
        int a2[]= new int [nums.length/2];
        int j=0; int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<0){
               a1[j]=nums[i] ;
                j++;
            }
           else if(nums[i]>=0){
               a2[k]=nums[i];
               k++;
           }
        }
       k=0; j=0;
        for(int i=0; i<nums.length;i++){
          if(i%2==0)  {
              nums[i]=a2[k];
              k++;
          }
            else{
                nums[i]=a1[j];
                j++;
            }
        }
        return nums;
    }
}