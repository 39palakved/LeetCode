class Solution {
    public int[] searchRange(int[] nums, int target) {
       
      ArrayList<Integer> li = new ArrayList<>();
      for(int k=0; k<nums.length;k++){
          li.add(nums[k]);
      }
        int arr[]= new int[2];
        
     
        int i= li.indexOf(target);
        int j = li.lastIndexOf(target);
         arr[0]=i;
        arr[1]=j;
        return arr;
    }
}