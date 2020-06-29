/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node node : root.children) {
            preorder(node);
        }

        return list;
    }

    ///////////////////////////////////////////////
    /**
     public List<Integer> preorder(Node root) {
     List<Integer> list = new ArrayList<>();

     preorder(root, list);

     return list;
     }
     protected void preorder(Node node, List<Integer> list){
     if(node ==null){
     return;
     }
     list.add(node.val);
     for(Node nodec:node.children){
     preorder(nodec,list);
     }
     }
     */
}