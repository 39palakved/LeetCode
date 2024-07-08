class Solution {
    public String sortString(String s) {
       int f [] = new  int [26];
        String ans ="";
        int h=0;
        for(int i=0; i<s.length();i++){
            int c  = s.charAt(i)-'a';
            f[c]++;
        }
        while(ans.length()<s.length()){
            for(int i=0; i<f.length;i++){
                if(f[i]>0){
                     h = i +'a';
                    ans+=(char) h;
                    f[i]--;
                }
                
            }
            for(int j=f.length-1; j>=0;j--){
                if(f[j]>0){
                     h = j +'a';
                    ans+=(char) h;
                    f[j]--;
                }
                
            }
            
        }
        return ans;
    }
}