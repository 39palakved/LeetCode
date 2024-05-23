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
    public void reorderList(ListNode head) {
         Stack <ListNode> st = new Stack<>();
        ListNode temp = head;
        int sz=0;
        while(temp !=null){
            st.push(temp);
            temp = temp.next;
            sz++;
        }
       for(int i=0; i<sz/2 ;i++){
           ListNode tp = st.pop();
           ListNode ele = head.next;
           tp.next = ele;
           head.next = tp;
           head = ele;
           
           
       }
        head.next = null;
        
        
    }
}