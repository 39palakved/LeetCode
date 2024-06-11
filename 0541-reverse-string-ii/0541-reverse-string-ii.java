class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb ;
        if(k>=s.length()){
            sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
        sb = new StringBuilder();
        int e=0;
        for(int i=0;i<s.length();i+=k){
            if(e%2==0){
                StringBuilder sb2;
                if(i+k<s.length())
                    sb2 = new StringBuilder(s.substring(i,i+k));
                else
                    sb2 = new StringBuilder(s.substring(i));
                sb.append(sb2.reverse());
            }else{
                if(i+k<s.length())
                    sb.append(s.substring(i,i+k));
                else
                    sb.append(s.substring(i));
            }
            e++;
        }
        return sb.toString();
    }
}