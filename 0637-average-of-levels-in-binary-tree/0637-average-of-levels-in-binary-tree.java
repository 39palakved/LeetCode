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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
       
        while(q.peek()!=null){
             double sum =0;
             int cnt=0;
        
        while(q.peek()!=null){
           TreeNode node = q.remove(); 
            sum+=node.val;
            cnt++;
            if(node.left!=null){
                q.add(node.left);
            }
             if(node.right!=null){
                    q.add(node.right);
            }
            
        }
         q.add(q.remove());
        li.add(sum/cnt);
       
        }
        
       return li; 
       
    }
    
    
    
}