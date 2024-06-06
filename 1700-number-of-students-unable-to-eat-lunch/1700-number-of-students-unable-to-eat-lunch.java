class Solution {
    public int countStudents(int[] s, int[] ss) {
        Queue<Integer> st1 = new LinkedList<>();
        Stack<Integer> st2 = new Stack<>();
        int cnt =0;
        for(int i=0; i<s.length; i++){
            st1.add(s[i]);
        }
        for(int i=ss.length-1; i>=0; i--){
            st2.push(ss[i]);
        }
        while(cnt<st1.size()){
            
            if(st1.peek()==st2.peek()){
                st1.remove();
                st2.pop();
                cnt=0;
            }
           
            else{
                
                int num =  st1.remove();
                st1.add(num);
                cnt++;
                
            }
        }
       return st1.size(); 
        
    }
}
