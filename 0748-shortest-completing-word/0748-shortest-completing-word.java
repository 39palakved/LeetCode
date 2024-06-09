class Solution {
    public String shortestCompletingWord(String l, String[] words) {
       l = l.replaceAll("[0-9]","").toLowerCase();
        l = l.replaceAll("\\s", "") ;
        HashMap<Character,Integer> map = new HashMap<>();
         for(int i=0;  i<l.length();i++){
             map.put(l.charAt(i),map.getOrDefault(l.charAt(i),0)+1);
         }
         String answer = "";
        int flag=1;
        for(int i=0;  i<words.length;i++){
            flag=1;
            HashMap<Character,Integer> map1 = new HashMap<>();
            for(int j=0; j<words[i].length();j++){
                map1.put(words[i].charAt(j),map1.getOrDefault(words[i].charAt(j),0)+1);
                
            }
           for(char key :map.keySet()){
            if(map1.containsKey(key)){
               if(map1.get(key)<map.get(key)){
                   flag=0;
                   break;
               }
            }
               else {
                    flag=0;
                    break;
               }
           
            
          
           }
           if(flag==1) {
                if(answer.equals("") || answer.length() > words[i].length()) {
                    answer = words[i];
                }
            } 
        }
        return answer;
    }
}