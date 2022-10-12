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
    public List<Integer> preorderTraversal(TreeNode root,List<Integer> ls) {
        if(root==null)
            return null;
        ls.add(root.val);
        preorderTraversal(root.left,ls);
        preorderTraversal(root.right,ls);
        return ls;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        preorderTraversal(root,ls);
        return ls;
    }
}