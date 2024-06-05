class Solution {
    public String largestGoodInteger(String num) {
        int max =0;
        int flag =1;
        int cnt=0;
        for(int i=0; i<num.length()-2;i++){
        String str = num.substring(i,i+3);
            flag =1;
        char c =str.charAt(0) ;
            for(int j=1; j<3; j++){
                if(str.charAt(j)!=c){
                    flag=0;
                    break;
                }
               
            }
            
            if(flag ==1){
                int no = Integer.parseInt(str);
                max = Math.max(max,no);
                cnt++;
            }
        }
        if(cnt==0){
            return "";
        }
        if(max ==0){
            return "000";
        }
        String st = Integer.toString(max);
        return st;
    }
}