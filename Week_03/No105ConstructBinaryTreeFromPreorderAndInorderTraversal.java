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
    int[] preorder;
    int[] inorder;
    int preorderIndex;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        this.inorder=inorder;
        preorderIndex=0;


        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return helper(0, inorder.length-1);

    }
    TreeNode helper(int left, int right){
        if(left>right){
            return null;
        }

        int rootValue = preorder[preorderIndex];

        int inorderIndex= map.get(rootValue);
        TreeNode root = new TreeNode(rootValue);
        preorderIndex++;

        root.left = helper(left,inorderIndex-1);
        root.right=helper(inorderIndex+1,right);

        return root;

    }
}