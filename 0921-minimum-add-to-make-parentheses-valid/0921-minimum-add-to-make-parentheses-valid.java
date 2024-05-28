class Solution {
    public int minAddToMakeValid(String s) {
        if (s.length()==0) {
            return 0;
        }
        Stack <Character> st = new Stack <>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        int cnt =0;
        while(!st.isEmpty()){
            cnt++;
            st.pop();
        }
        return cnt;
    }
}