class Solution {
    public boolean isPalindrome(String s) {
       s =  s.toLowerCase();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
              sb.append(c);
              sb1.append(c);
           }
        }
         if(sb1.toString().equals(sb.reverse().toString())){
            return true;
         }
         return false;
    }
}