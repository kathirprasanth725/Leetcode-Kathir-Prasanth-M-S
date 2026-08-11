// Last updated: 8/11/2026, 2:19:07 PM
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
    List<Integer> l=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        return l;
        l.add(root.val);
         preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }
}