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
// Global Variable.....
    ArrayList<Integer> list = new ArrayList<>();
    int cnt=0;

    private void preOrder(TreeNode root1){ // Adding all the LeafNodes to the List
        if(root1==null) return;

        if(root1.left==null && root1.right==null){
            list.add(root1.val);
        }
        preOrder(root1.left);
        preOrder(root1.right);
    }

// Checking if all the LeafNode of second root2 is Present or Not...
    private boolean check(TreeNode root2){
        if(root2==null) return true;

        boolean left = check(root2.left);
        boolean right = check(root2.right);

        if(root2.left==null && root2.right==null){
            if(cnt>list.size()) return false;
            if(cnt<list.size() && root2.val != list.get(cnt)){
                return false;
            }
            cnt++;
        }
        return left && right;
    }


// Drive Code....
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        preOrder(root1);
        boolean res = check(root2); // Result Verify....
        return cnt != list.size()?false:res;
    }
}