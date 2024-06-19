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
     ArrayList<Integer> li = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       in(root,li);
        return li;
    }
    public void in(TreeNode root,ArrayList<Integer>li){
        if(root==null){
            return;
        }
        
        in(root.left,li);
        li.add(root.val);
        in(root.right,li);
    }
}