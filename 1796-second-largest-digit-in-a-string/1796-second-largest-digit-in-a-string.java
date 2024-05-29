class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
       ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int m = Character.getNumericValue(s.charAt(i));
                if(set.add(m)){
                li.add(m);
                }
            }
        }
        Collections.sort(li);
        if(li.size()<=1){
            return -1;
        }
       
        return li.get(li.size()-2);
    }
}