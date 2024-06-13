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
  
      
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        path(li,root,sb);
        return li;
    }
      
 public void path(List<String>li,TreeNode root, StringBuilder sb) {
     int temp = sb.length();
        if(root.left==null && root.right==null){
            sb.append(root.val);
            li.add(sb.toString());
           
           
        }
        else{
            sb.append(root.val);
            sb.append("->");
            if(root.left!=null){
                path(li,root.left,sb);
            }
            if(root.right!=null){
              path(li,root.right,sb); 
            }
        }
      sb.setLength(sb.length()-(sb.length()-temp));
       
    }
}