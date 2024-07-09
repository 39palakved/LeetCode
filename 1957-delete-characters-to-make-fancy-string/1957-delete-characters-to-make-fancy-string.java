class Solution {
     String ans = "";
    public String makeFancyString(String s) {
        int cnt =1;
        StringBuilder sb = new StringBuilder(s);
        for(int  i=1; i<sb.length();i++){
           if(sb.charAt(i)==sb.charAt(i-1)){
               cnt++;
               if(cnt>=3){
                   sb.deleteCharAt(i);
                   i--;
               
               }
           }
            else{
                cnt =1;
            }
       }
       return sb.toString();
    }
}