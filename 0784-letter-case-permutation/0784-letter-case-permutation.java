class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> li = new ArrayList<>();
        String op ="";
        solve(s,li,op);
        return li;
    }
    void solve(String s, ArrayList<String>li,String op){
        if(s.length()==0){
            li.add(op);
            return;
        }
       
        if(!Character.isDigit(s.charAt(0))){
        String op1= op;
        String op2 = op;
        op1+=Character.toLowerCase(s.charAt(0));
        op2+=Character.toUpperCase(s.charAt(0));
        
       
        s= s.substring(1);
        solve(s,li,op1);
        solve(s,li,op2);
        }
        else{
            String op1 = op;
            op1+=s.charAt(0);
            s = s.substring(1);
            solve(s,li,op1);
       }
       return ;

    }
}