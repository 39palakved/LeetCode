class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
       int cnt =0;
        for(int j=0; j<nums1.length; j++){
            for(int i=0; i<nums2.length; i++){
                if(nums1[j]%(nums2[i]*k)==0){
                    cnt++;
                    
                }
         }
        }
        return cnt;
    }
}