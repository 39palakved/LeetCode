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
 
        path(li,root,"");
        return li;
    }
      
 public void path(List<String>li,TreeNode root, String str) {
    
        if(root.left==null && root.right==null){
           str+=root.val;
            li.add(str);
           
           
        }
        else{
            str+=root.val;
            str+="->";
            if(root.left!=null){
                path(li,root.left,str);
            }
            if(root.right!=null){
              path(li,root.right,str); 
            }
        }
     
       
    }
}