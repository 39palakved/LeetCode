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
    public ListNode swapNodes(ListNode head, int k) {
         ListNode temp1 = head;
        ListNode temp2= head;
        ListNode temp = head;
        int cnt=0; 
         while(temp!=null){
                cnt++;
             temp= temp.next;
         
         }
   
         
        int last = cnt-k;
        int i=1;
        while(i<k){
            temp1 = temp1.next;
            i++;
        }
    
         i=0;
        while(i<last){
            temp2 = temp2.next;
            i++;
        }
       
       int val3 = temp1.val;
        temp1.val = temp2.val;
        temp2.val = val3;
        return head;
        
    }
}