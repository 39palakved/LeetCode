class Solution {
    public boolean isPalindrome(String s) {
       String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        String st= sb.toString();
        if(sb.reverse().toString().equals(st)){
            return true;
        }
        return false;
    }
}