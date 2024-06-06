class Solution {
    public int canBeTypedWords(String text, String b) {
       char c [] = b.toCharArray() ;
      String s[]= text.split(" ");
        int cnt =s.length;
        for(int i=0; i<s.length;i++){
            int flag=0;
            for(int j=0; j<c.length;j++){
                if(s[i].indexOf(c[j])!=-1){
                   flag=1;
                    break;
                }
            }
            if(flag==1){
                cnt--;
            }
        }
        return cnt;
    }
}