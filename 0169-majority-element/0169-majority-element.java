class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max =0;
        int num =0;
        for(int key:map.keySet()){
            if(max<map.get(key)){
                num = key;
                max = map.get(key);
            }
            
        }
        return num;
    }
}