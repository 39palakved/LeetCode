class Solution {
    public String makeFancyString(String s) {
       Stack<Character> st = new Stack<>();
        int cnt =1;
        st.push('0');
         
        for(int i=0; i<s.length();i++){
              
              
            
             if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.push(s.charAt(i));
                cnt++;
                 if(cnt>=3){
                st.pop();
                
                }
                 
            }
                else{
                    st.push(s.charAt(i));
                    cnt=1;
                }
            
        }
        StringBuilder sb = new StringBuilder();
         while(st.size()>1){
             sb.append(st.pop());
         }
    
        return sb.reverse().toString();
        
       
    }
}