class Solution {
    public boolean isValid(String s) {
        int cnt1 =0;
        int cnt2 =0;
        String v = "AEIOUaeiou";
       if(s.length()<3) {
           return false;
       }
       
      
          
       
        for(int i=0; i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                return false;
            }
            if(!Character.isDigit(s.charAt(i))&& v.indexOf(s.charAt(i))==-1  ){
                cnt1++;
            }
            if(v.indexOf(s.charAt(i))!=-1){
                cnt2++;
            }
        }
        if(cnt1==0){
            return false;
        }
        if(cnt2==0){
            return false;
        }
        return true;
        
    }
}