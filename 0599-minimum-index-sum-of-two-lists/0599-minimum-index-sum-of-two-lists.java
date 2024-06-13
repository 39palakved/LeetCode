class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = 100000;
        ArrayList<String> li = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
       HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> l2 = new ArrayList<>();
        for(int i=0; i<Math.max(list1.length,list2.length);i++){
            if(i<list1.length){
                l1.add(list1[i]);
            }
            if(i<list2.length){
                l2.add(list2[i]);
            }
        }
         
        for(int i=0; i<l1.size(); i++){
            if(l2.contains(l1.get(i))){
                int k = l2.indexOf(l1.get(i));
                int  sum = i+k;
                 map.put(l1.get(i),sum);
                 min=Math.min(min,sum);
        }
        }
        for(String key : map.keySet()){
            if(map.get(key)==min){
                li.add(key);
            }
        }

       
        
        String str[]= new String[li.size()];
        for(int i=0; i<li.size();i++){
            str[i]=li.get(i);
        }
        return str;
    }
}