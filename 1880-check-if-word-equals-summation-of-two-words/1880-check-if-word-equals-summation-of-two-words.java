class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int max =0;
        int num1=0,num2=0,num3=0;
        max = Math.max(f.length(),Math.max(s.length(),t.length()));
        for(int i=0; i<max ;i++){
            if(i<f.length()){
                int n = (int)f.charAt(i)-97;
                num1 = num1*10+n;
            }
            if(i<s.length()){
                int n = (int)s.charAt(i)-97;
                num2 = num2*10+n;
            }
            if(i<t.length()){
                int n = (int)t.charAt(i)-97;
                num3 = num3*10+n;
            }
            
            
        }
        if(num1+num2==num3){
            return true;
        }
        return false;
    }
}