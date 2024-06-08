class Solution {
    public int lengthOfLongestSubstring(String str) {
        if(str.length()==0||str== null)
            return 0;
        Set set=new HashSet();
        int j=0,max=0;
        for(int i=0;i<str.length();i++){
            while(!set.add(str.charAt(i)))
                set.remove(str.charAt(j++));
            max=Math.max(max,i-j+1);
        }
        return max;
        
    }
}