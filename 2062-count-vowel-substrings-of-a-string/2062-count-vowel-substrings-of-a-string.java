class Solution {
    public int countVowelSubstrings(String word) {
        String s ="aeiou";
        int cnt =0;
        for(int i=0; i<word.length()-4;i++){
            HashSet <Character> set = new HashSet<>();
            for(int j=i;j<word.length();j++){
                if(s.indexOf(word.charAt(j))!=-1){
                    set.add(word.charAt(j));
                    if(set.size()==5){
                        cnt++;
                    }
                }
                else{
                    break;
                }
               
            }
        }
        return cnt;
    }
}