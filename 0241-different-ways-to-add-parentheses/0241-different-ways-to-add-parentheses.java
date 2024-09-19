class Solution {
         
    public List<Integer> diffWaysToCompute(String expression) {
       return fun(expression);
        
    }
    public static ArrayList<Integer> fun(String s){
        if(s.indexOf('+')==-1 && s.indexOf('*')==-1 && s.indexOf('-')==-1){
             ArrayList<Integer> bs = new ArrayList<>();
             bs.add(Integer.parseInt(s));
            return bs ; 
        }
        ArrayList<Integer> li = new ArrayList<>();
         for(int i=0; i<s.length();i++){
             if(s.charAt(i)=='*' || s.charAt(i)=='-' || s.charAt(i)=='+'){
                  ArrayList<Integer> left = fun(s.substring(0,i));
                  ArrayList<Integer> right = fun(s.substring(i+1));
                 for(int val: left){  
                    for(int val1: right){
                     if(s.charAt(i)=='-')
                        li.add(val-val1);
                     
                     if(s.charAt(i)=='*')
                        li.add(val*val1);
                     
                        if(s.charAt(i)=='+')
                        li.add(val+val1);
                     
                 }
             }
         }
    }
        return li;
}
}