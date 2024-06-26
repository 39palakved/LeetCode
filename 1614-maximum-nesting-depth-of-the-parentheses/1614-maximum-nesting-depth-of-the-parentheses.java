class Solution {
    public int maxDepth(String s) {
   
        int cnt=0;
        int max =0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
                max = Math.max(cnt,max);
            }
            else if(s.charAt(i)==')'){
                cnt--;
            }
        }
        return max;
    }
}