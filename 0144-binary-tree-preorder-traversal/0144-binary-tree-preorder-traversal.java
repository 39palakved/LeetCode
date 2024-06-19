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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        pre(root,li);
        return li;
    }
    public void pre(TreeNode root,ArrayList<Integer>li){
        if(root==null){
            return;
        }
        li.add(root.val);
        pre(root.left,li);
        pre(root.right,li);
    }
}