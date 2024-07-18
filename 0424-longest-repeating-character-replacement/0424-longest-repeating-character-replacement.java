// class Solution {
//     public int characterReplacement(String s, int k) {
//         int maxlength=0;
//         for(int i=0; i<s.length();i++){
//               HashMap<Character,Integer> map = new HashMap<>();
//             int max =0;
//             for(int j=i;j<s.length();j++){
//                 map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
//                 max = Math.max(max,map.get(s.charAt(j)));
//                 int len = j-i+1;
//                 int min = len-max;
//                 if(min>k){
//                     break;
//                 }
//                 else{
//                     maxlength = Math.max(maxlength,len);
                    
//                 }
               
//             }
//         }
//         return maxlength;
//     }
// }
class Solution {
    public int characterReplacement(String s, int k) {
      int l = 0; int r=0; 
        int maxlength=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
             map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
             max = Math.max(max,map.get(s.charAt(r)));
              
           
              while((r-l+1)-max>k){
                 map.put(s.charAt(l),map.get(s.charAt(l))-1) ;
                  max =0;
                  for(char key: map.keySet()){
                      max = Math.max(max,map.get(key));
                  }
                  l++;
              }
            if((r-l+1)-max<=k){
         maxlength = Math.max(maxlength,r-l+1);
            }
            r++;
        }
    return maxlength;
   }
}
