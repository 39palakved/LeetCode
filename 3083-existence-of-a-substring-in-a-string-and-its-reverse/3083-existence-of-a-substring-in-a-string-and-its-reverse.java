class Solution {
    public boolean isSubstringPresent(String s) {
        
        for(int i=0; i<s.length()-1; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(i,i+2));
            if(s.indexOf(sb.reverse().toString())!=-1){
                return true;
            }
           
        }
        return false;
    }
}