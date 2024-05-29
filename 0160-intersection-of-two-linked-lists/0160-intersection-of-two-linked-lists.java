/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ArrayList<ListNode> l1 = new ArrayList<>();
     ArrayList<ListNode> l2 = new ArrayList<>();
     while(headA!= null){
        l1.add(headA);
        headA= headA.next;
     }
     while(headB!=null){
           l2.add(headB);
           headB= headB.next;
       }
       for(int i=0; i<Math.min(l1.size(),l2.size());i++){
          if(l1.size()>l2.size()){
            if(l1.contains(l2.get(i))){
                return l2.get(i);
            }
          }
            else{
                if(l2.contains(l1.get(i))){
                    return l1.get(i);
                }
            }
          }
       return null;
    }
}