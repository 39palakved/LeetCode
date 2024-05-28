class Solution {
    public List<String> buildArray(int[] t, int n) {
        Stack<Integer> st = new Stack<>();
        ArrayList<String> li= new ArrayList<>();
        int j=0;
        for(int i=1; i<=n;i++){
           
                 st.push(i);
                 li.add("Push");
             
            
            if(!st.isEmpty() && st.peek()!=t[j] ){
                st.pop();
                li.add("Pop");
                
               
            }
            else{
                j++;
            }
            if(j>=t.length){
                break;
            }
            
        }
        return li;
    }
}