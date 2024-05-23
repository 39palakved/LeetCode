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
    public int pairSum(ListNode head) {
      ArrayList<Integer> li = new ArrayList<>(); 
        ListNode temp = head;
        while(temp !=null){
            li.add(temp.val);
            temp = temp.next;
        }
        int i=0;
        int j= li.size()-1;
        int max1 =0;
        while(i<j){
         int sum = li.get(i)+li.get(j) ;
            max1 = Math.max(max1,sum);
            i++;
            j--;
        }
        return max1;
    }
}