/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     int tot_sum =0;  
  int findsum(TreeNode root){
      if(root==null){
          return 0;
      }
     
    
       
      int  sum =root.val+findsum(root.left)+findsum(root.right);
      return sum;
   
  }
  void solve(TreeNode root){
      if(root==null){
           return  ;
       }
        
      tot_sum+=Math.abs(findsum(root.left)-findsum(root.right));
      solve(root.left);
      solve(root.right);
     
  }
       
    public int findTilt(TreeNode root) {
   
       solve(root);
        
        return tot_sum ;
    }
}