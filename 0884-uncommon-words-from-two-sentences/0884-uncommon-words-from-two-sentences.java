class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String c1[]= s1.split(" ");
        String c2[]= s2.split(" ");
        ArrayList<String> li = new ArrayList<>();
      
        HashMap<String,Integer> map1 = new HashMap<>();
         HashMap<String,Integer> map2 = new HashMap<>();
        for(int i=0; i<c1.length; i++){
            map1.put(c1[i], map1.getOrDefault(c1[i],0)+1);
        }
         for(int i=0; i<c2.length; i++){
            map2.put(c2[i], map2.getOrDefault(c2[i],0)+1);
        }
        for(String key:map1.keySet()){
            if(!map2.containsKey(key)&& map1.get(key)==1){
                li.add(key);
            }
        }
         for(String key:map2.keySet()){
            if(!map1.containsKey(key)&& map2.get(key)==1){
                li.add(key);
            }
        }
        String res[] = new String[li.size()];
        for(int i=0; i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;
    }
}