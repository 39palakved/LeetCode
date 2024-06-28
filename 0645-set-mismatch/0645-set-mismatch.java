class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]= new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if(!set.add(nums[i])){
                 arr[0]=nums[i];
                 
            }
            else{
                sum+=nums[i];
            }
            
          }
        int n = nums.length;
        int r = n*(n+1)/2;
        arr[1]= r-sum;
       
    
       return arr;
    }
}