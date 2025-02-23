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
    int idx=0;
    public void traverse(TreeNode node, ArrayList<Integer> arr ){
    if(node == null) return;

    traverse(node.left,arr);
    arr.add(node.val);
    traverse(node.right,arr);
    
    }

    public void recoverTree(TreeNode root) {
    ArrayList<Integer> arr = new ArrayList<>();
    if(root==null) return;
    traverse(root,arr);
    Collections.sort(arr);

    helper(root,arr);
    }

    public void helper(TreeNode node , ArrayList<Integer>arr){
    if(node == null) return;
    helper(node.left,arr);
    node.val = arr.get(idx);
    idx++; 
    helper(node.right,arr);
    }
}