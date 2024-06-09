class Solution {
    public String mostCommonWord(String p, String[] banned) {
        p = p.toLowerCase().replaceAll("[^a-zA-Z]"," ");
        String arr[]= p.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
       List li = Arrays.asList(banned);
       
        for(int i=0; i<arr.length;i++){
            if(!arr[i].equals(" ")){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int max =0;
       String str="";
        for(String key:map.keySet()){
            int val = map.get(key);
           if(!li.contains(key) && val>max){
               max= val;
               str = key;
           }
              
               
        }
        return str;
    }
}