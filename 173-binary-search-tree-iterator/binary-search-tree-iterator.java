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
class BSTIterator {
    ArrayList<Integer> arr;
    public void inOrder(TreeNode root){
    if(root==null) return;
    inOrder(root.left);
    arr.add(root.val);
    inOrder(root.right);
    }

    public BSTIterator(TreeNode root) {
    arr= new ArrayList<>();
    inOrder(root);
    }
    
    public int next() {
    int ans = arr.get(0); 
    arr.remove(0);
    return ans;   
    }
    
    public boolean hasNext() {
    return arr.size()>0; 
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */