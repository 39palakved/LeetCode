class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum =0;
        for(int i=0; i<nums.size();i++){
        ArrayList<Integer> li= new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
            for(int j=i; j<nums.size();j++){
            if(set.add(nums.get(j))){
                li.add(nums.get(j));
            }
            sum+=li.size()*li.size();
            }
        }
        
        return sum; 
    }
}