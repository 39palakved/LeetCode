class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> li = new ArrayList<>();
        int n= m.length;
        int m1 = m[0].length;
        int left=0;
        int right=m1-1;
        int top=0;
        int bottom = n-1;
        //right botton left top  order to perform
        while(top<=bottom && left<=right){
        for(int i=left; i<=right; i++){
             li.add(m[top][i]);
        }
        top++;
        for(int j=top; j<=bottom; j++){
            li.add(m[j][right]);
        }
        right--;
            if(top<=bottom){
        for(int k=right; k>=left; k--){
            li.add(m[bottom][k]);
        }
        bottom--;
     }
            if(left<=right){
        for(int l=bottom; l>=top; l--){
            li.add(m[l][left]);
        }
        left++;
            }
        }
        return li;
    }
    
}