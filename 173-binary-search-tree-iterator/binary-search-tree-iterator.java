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
    Stack<TreeNode> stk = new Stack<>();

    public void traverse(TreeNode node ){
        while(node!=null){
            stk.push(node);
            node= node.left;
        }
    }

    public BSTIterator(TreeNode root) {
    traverse(root);
    }
    
    public int next() {
    TreeNode ans = stk.pop();
    if(ans.right!=null){
        traverse(ans.right);
    }
    return ans.val;
    }
    
    public boolean hasNext() {
    return !stk.isEmpty();   
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */