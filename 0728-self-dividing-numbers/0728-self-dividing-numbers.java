class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=left; i<=right;i++){
            int flag=0;
            int num =i;
            while(i!=0){
                int rem = i%10;
                i=i/10;
                if(rem==0){
                    flag=1;
                    break;
                }
                else if( num%rem!=0){
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                li.add(num);
            }
            i=num;
        }
        return li;
    }
}