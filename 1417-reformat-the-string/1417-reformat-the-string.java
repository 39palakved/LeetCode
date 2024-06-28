class Solution {
    public String reformat(String s) {
        
        String st =s;
        String ans ="";
        String str1 = s.replaceAll("\\d","");
        String str2 =st.replaceAll("[a-z]","");
        if(str1.length()==0 && str2.length()==0){
            return "";
        }
        if(Math.abs(str1.length()-str2.length())>1){
            return "";
        }
       if(str1.length()>str2.length()){
        for(int i=0; i<str2.length();i++){
            ans+=str1.charAt(i);
            ans+=str2.charAt(i);
        }
          
               ans+=str1.charAt(str1.length()-1);
           
       }
        else{
           for(int i=0; i<str1.length();i++){
            ans+=str2.charAt(i);
            ans+=str1.charAt(i);
        } 
            if(str2.length()>str1.length()){
            ans+=str2.charAt(str2.length()-1);
            }
        }
        return ans;
    }
}