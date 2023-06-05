
class Solution 
{
    public boolean isBalanced(TreeNode root)
    {
        return check (root) != -1;
    }
   
    int check(TreeNode root)
    {
        if(root==null) return 0;

        int leftHeight = check(root.left);
        int rightHeight = check(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        if (leftHeight == -1) return -1;
        if (rightHeight == -1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}