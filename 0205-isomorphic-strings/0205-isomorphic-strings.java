// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap <Character, Integer> map1 = new HashMap<>();
//         HashMap <Character, Integer> map2= new HashMap<>();
//         if(s.length()!=t.length()){
//             return false;
//         }
//         for(int i=0; i<s.length();i++){
//             map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
//              map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
//              if(map1.get(s.charAt(i))!=map2.get(t.charAt(i))){
//                 return false;
//              }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch1 =s.charAt(i);
            char ch2 =t.charAt(i);
            if(!map1.containsKey(ch1)){
                map1.put(ch1,ch2);
            }
             if(!map2.containsKey(ch2)){
                map2.put(ch2,ch1);
            }
            if(map1.get(ch1)!=ch2 || map2.get(ch2)!=ch1){
            return false;
            }
        }
        return true;
    }
 }