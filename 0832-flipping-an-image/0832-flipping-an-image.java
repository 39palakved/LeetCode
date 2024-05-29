class Solution {
    public int[][] flipAndInvertImage(int[][] m) {
        int arr[][] = new int[m.length][m[0].length];
        for(int i=0; i<m.length;i++){
            int k=0;
            for(int j=m[0].length-1;j>=0; j--){
                 arr[i][k] = (m[i][j] ^1);
                k++;
            }
            
        }
        return arr;
    }
}