class Solution {
    static class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public int largestRectangleArea(int[] h) {
        int l[]= nsl(h);
        int r [] = nsr(h);
        int max =0;
       int w []= new int [h.length] ;
        for(int i=0; i<h.length;i++){
            w[i]= (r[i]-l[i]-1)*h[i];
           
        }
        Arrays.sort(w);
        return w[w.length-1];
    }
   public  int[] nsr(int [] h){
        Stack<pair> st = new Stack<>();
        int right [] = new int [h.length];
        for(int i=h.length-1; i>=0; i--){
            if(st.isEmpty()){
                
                right[i]=h.length;
            }
            else if(!st.isEmpty() && st.peek().first<h[i]){
                 right[i]=st.peek().second;
            }
            else if(!st.isEmpty() && st.peek().first>=h[i]){
                while(!st.isEmpty() && st.peek().first>=h[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                   
                    right[i]=h.length;
                }
                else{
                    right[i]= st.peek().second;
                }
            }
           
            st.push(new pair(h[i],i));
        }
       int rig[]= new int [right.length];
       int k=0;
       for(int j=h.length-1; j>=0; j--){
       rig[j]= right[j];
           k++;
     }
       return rig;
    }
        
   public int[] nsl(int [] h){
        Stack<pair> st = new Stack<>();
        int left [] = new int [h.length];
        for(int i=0; i<h.length; i++){
            if(st.isEmpty()){
                
                left[i]=-1;
            }
            else if(!st.isEmpty() && st.peek().first<h[i]){
                 left[i]=st.peek().second;
            }
            else if(!st.isEmpty() && st.peek().first>=h[i]){
                while(!st.isEmpty() && st.peek().first>=h[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                   
                    left[i]= -1;
                }
                else{
                    left[i]= st.peek().second;
                }
            }
             st.push(new pair(h[i],i));
        }
       return left;
    }
        
    
}