class Solution {
    public int maximumLengthSubstring(String s) {
       ArrayList<String> li = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int flag=0;
        String str="";
        int j=0;
        for(int i=0; i<s.length();i++){
            
           char c  = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)<=2){
                str+=c;
                flag=1;
            }
            else{
                li.add(str);
                str="";
                map.clear();
                
                flag=0;
                i=j;
                j++;
            }
            
            
        }
        if(flag==1){
           li.add(str);  
        }
        int arr []= new int [li.size()];
        for(int i=0; i<li.size();i++){
            arr[i]= li.get(i).length();
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}