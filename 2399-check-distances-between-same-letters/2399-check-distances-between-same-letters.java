class Solution {
    public boolean checkDistances(String s, int[] d) {
    
       HashSet<Character> set = new HashSet<>();
        ArrayList <Character> li = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            if(set.add(s.charAt(i))){
                li.add(s.charAt(i));
            }
        }
        for(int i=0; i<li.size();i++){
            char c = li.get(i);
        int f = s.indexOf(c);
        int e = s.lastIndexOf(c);
        int idx = c-97;
        if(d[idx]!=(e-f-1)){
            return false;
        }
          
        }
        return true;
    }
}