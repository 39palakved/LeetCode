class Solution {
    public int hammingDistance(int x, int y) {
//         int cnt =0;
//         while(x!=0 || y!=0){
//         if(x%2!=y%2){
           
//             cnt++;
//         }
//             x=x/10;
//             y=y/10;
       
//         }
//    }
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }
}