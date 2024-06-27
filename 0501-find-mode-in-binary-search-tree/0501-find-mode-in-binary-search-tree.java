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
    HashMap<Integer,Integer> map = new HashMap<>();
    int max =0;
    HashSet <Integer> set = new HashSet<>();
    ArrayList<Integer> li = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        mode(root);
        for(int key:map.keySet()){
           max =Math.max(max,map.get(key));
        }
        for(int key:map.keySet()){
            if(map.get(key)==max){
                if(set.add(key)){
                li.add(key);
                }
        }
        }
        int arr[] = new int[li.size()];
        for(int i=0; i<li.size();i++){
            arr[i]= li.get(i);
        }
     
    
           return arr;
    }
    void mode (TreeNode root){
        if(root==null){
            return;
        }
       
        mode(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        mode (root.right);
        
        }
    
}