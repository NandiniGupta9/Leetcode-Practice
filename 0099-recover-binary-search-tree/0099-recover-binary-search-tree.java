class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null; 

    public void recoverTree(TreeNode root) {
        traverse(root);
        
      
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.left);

      
        if (prev != null && prev.val >= root.val) {
            if (first == null) {
                first = prev;
            }
           
            second = root;
        }
        
        prev = root;

        traverse(root.right);
    }
}