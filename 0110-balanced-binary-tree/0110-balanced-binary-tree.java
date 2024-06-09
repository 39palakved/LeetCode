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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
       int lh = findleft(root.left);
       int rh= findright(root.right);
        if(Math.abs(lh-rh)>1){
            return false;
        }
      boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right); 
        if(!left || !right){
            return false;
        }
        return true;
    }
    int findleft(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(findleft(node.left),findleft(node.right))+1;
    }
    int findright(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(findleft(node.left),findleft(node.right))+1;
    }
    
}