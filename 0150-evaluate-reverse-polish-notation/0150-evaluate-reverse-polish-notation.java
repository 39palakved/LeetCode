class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack();
        int ans =0;
        for(String s : tokens)
        {

            if(s.equals("+"))
            
            {
                int val1 = st.pop();
                int val2 = st.pop();
                st.add(val2+val1);
            }
            else if(s.equals("-")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.add(val2-val1);
            }
            else if(s.equals("*")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.add(val2*val1);
            }
            else if(s.equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.add(val2/val1);
            }
            else 
            {
                st.add(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}