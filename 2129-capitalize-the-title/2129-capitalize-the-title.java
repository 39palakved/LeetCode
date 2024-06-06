class Solution {
    public String capitalizeTitle(String title) {
        String str[]= title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++){
            if(str[i].length()>=3){
            String up = ""+ Character.toUpperCase(str[i].charAt(0));
            String low =  str[i].substring(1,str[i].length()).toLowerCase();
            sb.append(up+low);
            }
            else{
                sb.append(str[i].toLowerCase());
            }
            if(i+1==str.length){
                break;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}