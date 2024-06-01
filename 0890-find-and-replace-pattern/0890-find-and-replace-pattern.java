class Solution {
    public List<String> findAndReplacePattern(String[] words, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
         HashMap<Character, Integer> map1 = new HashMap<>();
        
        List <String> li = new ArrayList<>();
        for(int i=0; i<words.length;i++){
            boolean flag=true;;
            for(int j=0; j<words[i].length();j++){
                
                if(map1.put(p.charAt(j), j) != map.put(words[i].charAt(j), j)){
                  flag = false;
                }
                
                
            }
            if(flag){
                li.add(words[i]);
            }
            map.clear();
            map1.clear();
           
        }
        return li;
    }
}