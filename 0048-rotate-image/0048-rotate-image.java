class Solution {
    ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
    
    public void rotate(int[][] m) {
        int n= m.length;
        for(int i=0; i<n;i++){
            ArrayList<Integer>li = new ArrayList<>();
            for(int j=0; j<n; j++){
                li.add(m[i][j]);
            }
            ll.add(li);
        }
        int k=0;
        for(int j=n-1; j>=0; j--){
            for(int i=0; i<n;i++){
                m[i][j]=ll.get(k).get(i);
            }
            k++;
        }
    }
}