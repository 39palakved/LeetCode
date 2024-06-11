class Solution {
    public char nextGreatestLetter(char[] l, char target) {
       char c='0';
        for(int i=0; i<l.length;i++){
            if((int)l[i]> (int)target){
                 c= l[i];
                break;
            }
        }
        if(c=='0'){
            c=l[0];
        }
        return c;
    }
}