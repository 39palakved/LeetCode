class Solution {
    public int[] frequencySort(int[] nums) {
        int arr[]= new int [nums.length];
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList <Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            return (map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b);
            
        });
        int j=0;
        for(int n:list){
            int cnt = map.get(n);
            for(int i=0; i<cnt; i++){
                arr[j]=n;
                j++;
            }
        }
        return arr;
    }
}