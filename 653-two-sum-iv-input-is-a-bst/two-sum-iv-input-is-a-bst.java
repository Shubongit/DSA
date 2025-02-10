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
    ArrayList<Integer> arr;
    public void helper(TreeNode node ){
        
        if(node==null){
            return; 
        }
        helper(node.left);
        arr.add(node.val);
        helper(node.right);

    }
    public boolean findTarget(TreeNode root, int k) {
    arr= new ArrayList<>();
    helper(root);
    int n = arr.size();
    int i=0;
    int j =n-1;
    while(i<j){
        int sum = arr.get(i)+arr.get(j);
        if(sum==k) return true;
        if(sum>k){
            j--;
        }else{
            i++;
        }
    }
    return false;
    }
}