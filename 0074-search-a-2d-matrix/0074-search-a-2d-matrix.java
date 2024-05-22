class Solution {
    public boolean searchMatrix(int[][] m, int target) {
          int i=0;
          int j=m[0].length-1;
                 while(i<m.length && j>=0){
                 if(target == m[i][j]){
                     return true;
                    
                 }
                 else if(target>m[i][j]){
                     i++;
                 }
                 else if(target<m[i][j]){
                     j--;
                 }
                 
             }
             
         return false;    
         
    }
}