class Solution {
    public String countAndSay(int n) {
   
        if(n==1){
            return "1";
        }
        if(n==2){
            return"11";
        }
        String s ="11";
       for(int i=3; i<=n; i++){
          String t="";
         int cnt =1;
           for(int j=0; j<s.length()-1;j++){
              if(s.charAt(j)!=s.charAt(j+1)){
                  t+=Integer.toString(cnt);
                  t+=s.charAt(j);
                  cnt=1;
              }
               else{
                   cnt++;
               }
           }
           t+=Integer.toString(cnt);
           t+=s.charAt(s.length()-1);
        s=t;
       }
        return s;
    }
}