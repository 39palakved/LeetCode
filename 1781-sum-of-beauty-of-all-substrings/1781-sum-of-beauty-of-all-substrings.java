class Solution {
    
    public int beautySum(String s) {
           int sum =0;
           int min = Integer.MAX_VALUE;
           int max = Integer.MIN_VALUE;
       for (int i=0; i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
          for(int j=i; j<s.length();j++){
               min = Integer.MAX_VALUE;
               max = Integer.MIN_VALUE;  
              map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
              if(map.size()==1){
                  continue;
              }
              for(char k :map.keySet()){
                  min = Math.min(min,map.get(k));
                  max = Math.max(max,map.get(k));
              }
              sum+=max-min;
           }
       }
        return sum ;
    }
    
}