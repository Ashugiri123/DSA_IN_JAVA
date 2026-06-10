package Heaps;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class checkCompleteBinaryTree {
    static int s;
    public static int size(TreeNode root){
        if(root == null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static boolean isComplete(TreeNode root,int idx) {
        if(root == null)return true;
        if(idx>s)return false;
        return isComplete(root.left,idx*2) && isComplete(root.right,(idx*2)+1);
    }
    public static boolean isCompleteTree(TreeNode root) {
        s=size(root);
        return isComplete(root,1);

    }
}
