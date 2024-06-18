class Solution {
    public void sortColors(int[] nums) {
       TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(int key:map.keySet()){
            int m=map.get(key);
            while(m!=0){
                nums[i]=key;
                i++;
                m--;
            }
        }
            
        
    }
}