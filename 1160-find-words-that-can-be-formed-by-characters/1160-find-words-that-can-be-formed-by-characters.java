class Solution {
    public int countCharacters(String[] words, String chars) {
        int flag =0;
        int sum =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(int i=0; i<words.length;i++){
            flag=0;
          HashMap<Character,Integer> map1= new HashMap<>();
            for(int j=0;j<words[i].length();j++){
            map1.put(words[i].charAt(j),map1.getOrDefault(words[i].charAt(j),0)+1);
                
          }
          for(char key :map1.keySet()){
              if(!map.containsKey(key)){
                  flag =1;
                  break;
              }
              else if(map1.get(key)>map.get(key)){
                  flag=1;
                  break;
              }
              
          } 
            if(flag==0){
               sum+= words[i].length();
            }
        }
         return sum;  
    }
}