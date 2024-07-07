class Solution {
    public int isPrefixOfWord(String sent, String sw) {
        String str [] = sent.split(" ");
        for(int i=0; i<str.length;i++){
            if(str[i].indexOf(sw)==0){
                return i+1;
            }
        }
        return -1;
    }
}