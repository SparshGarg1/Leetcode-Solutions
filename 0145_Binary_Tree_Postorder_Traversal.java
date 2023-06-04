class Solution {
    private void traverse(TreeNode root, List<Integer> al)
    {
        if(root==null) return;
        traverse(root.left, al);
        traverse(root.right,al);
        al.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        LinkedList<Integer> al = new LinkedList<>();
        traverse(root, al);
        return al;
    }
}