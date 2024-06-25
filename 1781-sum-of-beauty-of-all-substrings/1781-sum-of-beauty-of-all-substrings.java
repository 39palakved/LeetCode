class Solution {
    public int beautySum(String s) {
        int sum =0;
        int min = 10000; 
        int max =0;
    
        for(int i=0; i<s.length();i++){
              HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i+1; j<=s.length();j++){
                 max =0;
                min=10000;
              
                map.put(s.charAt(j-1),map.getOrDefault(s.charAt(j-1),0)+1);
                if(map.size()==1){
                    continue;
                }
                else{
                for(char key:map.keySet()){
                    min= Math.min(min,map.get(key));
                    max = Math.max(max,map.get(key));
                }
                    sum+=(max-min);
                }
                
              
                
            }
        }
      return sum;
    }
}