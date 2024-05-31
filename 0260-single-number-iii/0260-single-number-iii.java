class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]= new int[2];
       HashMap<Integer,Integer> map =  new HashMap<>();
       for(int i=0; i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int i=0;
    for(int c:map.keySet()){
        if(map.get(c)==1){
            arr[i]=c;
            i++;
        }
    }
        return arr;
    }
}