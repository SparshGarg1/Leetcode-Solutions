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
    private void traverse(TreeNode root, List<Integer> al)
    {
        if(root==null) return;
        traverse(root.left, al);
        al.add(root.val);
        traverse(root.right,al);
    }
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        LinkedList<Integer> al = new LinkedList<>();
        traverse(root, al);
        return al;
    }
}