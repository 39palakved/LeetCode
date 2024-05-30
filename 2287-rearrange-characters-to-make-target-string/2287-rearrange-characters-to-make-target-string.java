class Solution {
    public int rearrangeCharacters(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
      
        int ans = 10000;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
       for(int i=0; i<t.length(); i++){
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i),0)+1);
        }
        for(char c :map1.keySet()){
            
            if(map.containsKey(c)){
            ans = Math.min(map.get(c)/map1.get(c),ans);
            }
            else{
                return 0;
            }
        }
      
        return ans;
        
        
    }
}