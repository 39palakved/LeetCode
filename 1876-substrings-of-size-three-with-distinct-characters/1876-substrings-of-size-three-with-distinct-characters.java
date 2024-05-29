class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> li = new ArrayList<>();
        int res=0;
        for(int i=0; i<s.length()-2;i++){
            li.add(s.substring(i,i+3));
        }
        for(int i=0; i<li.size();i++){
            int cnt =0;
            HashSet<Character> set = new HashSet<>();
            String str = li.get(i);
            for(int j=0; j<str.length();j++){
                if(set.add(str.charAt(j))){
                    cnt++;
                }
            }
            if(cnt==str.length()){
                res++;
            }
        }
        return res;
    }
}