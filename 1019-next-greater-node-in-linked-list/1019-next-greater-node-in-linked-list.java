/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
            ListNode temp = head;
             ListNode temp1 = head;
        ArrayList<Integer> li = new ArrayList<>();
        while(temp !=null){
            
            li.add(temp.val);
            temp = temp.next;
        }
        int arr[] = new int[li.size()];
        
      
        int j=0;
         int k=0;
        int num =0;
            while(temp1.next!=null){
               num=0;
                int dig = temp1.val;
                for(int i=j+1; i<li.size();i++){
                    if(dig<li.get(i)){
                        num =li.get(i) ;
                        break;
                    }
                }
              
               
               
                arr[k]= num;
                k++;
                
                j++;
                temp1 = temp1.next;
            }
        return arr;
    }
}