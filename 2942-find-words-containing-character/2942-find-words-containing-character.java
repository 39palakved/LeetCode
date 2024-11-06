class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> li = new ArrayList<>();
        int i=0;
        for(String s : words){
            if(s.indexOf(x)!=-1){
                li.add(i);
            }
            i++;
        }
        return li;
    }
}