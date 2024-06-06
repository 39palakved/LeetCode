class Solution {
    public int getLucky(String s, int k) {
         
        String str ="";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int ans = ((int)c-97)+1;
            str+=Integer.toString(ans);
        }
       
       
     //    long sum =0;
     //    while(k!=0){
     //        sum=0;
     //      while(num !=0){
     //          long rem = num%10;
     //          num = num/10;
     //          sum+=rem;
     //      }
     //        num = sum ;
     //        k--;
     //    }
     // int res = (int)num; 
     //    return res;
        int j=0;
        int sum =0;
        while(k!=0){
            sum =0;
        while(j<str.length()){
            int n =Character.getNumericValue(str.charAt(j));
            sum+=n;
            j++;
        }
        j=0;
        str = Integer.toString(sum);
            k--;
    }
        int res = Integer.parseInt(str);
    return res;
        }
}