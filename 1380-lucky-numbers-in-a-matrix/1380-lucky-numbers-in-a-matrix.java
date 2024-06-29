class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
        ArrayList<Integer> li = new ArrayList<>();
          
        int col=0;
        for(int i=0 ;i<m.length;i++){
           int min =100000;
            for(int j=0; j<m[0].length;j++){
                if(m[i][j]<min){
                    min = m[i][j];
                    col=j;
                }
            }
            boolean flag =true;
            for(int k=0; k<m.length;k++){
                if(m[i][col]<m[k][col]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                li.add(m[i][col]);
            }
        }
        return li;
    }
}