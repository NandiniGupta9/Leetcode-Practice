/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
           
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                
                if (current.left == null && current.right == null) {
                    return depth;
                }
                
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            depth++;
        }
        return depth;
    }
}