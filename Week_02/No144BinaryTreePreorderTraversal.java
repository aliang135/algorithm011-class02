/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ///////////////////////////////////////////////////

    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }

    ////////////////////////////////////////////////////
    /**
     public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> list = new ArrayList<>();
     preorderTraversal(root,list);

     return list;
     }

     protected void preorderTraversal(TreeNode node,List<Integer> list){
     if (node==null){
     return;
     }
     list.add(node.val);
     preorderTraversal(node.left,list);
     preorderTraversal(node.right,list);

     }
     */
}