class Solution {
    public int scoreOfString(String s) {
        char ch[] = s.toCharArray();
        int sum =0;
        for(int i=1; i<ch.length;i++){
            sum+=Math.abs((int)ch[i]-(int)ch[i-1]);
        }
        return sum;
    }
}