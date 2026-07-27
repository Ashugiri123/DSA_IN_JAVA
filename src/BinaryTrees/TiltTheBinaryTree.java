package BinaryTrees;

public class TiltTheBinaryTree {
    int Tsum = 0;

    public int findTilt(Node root) {

        dfs(root);
        return Tsum;

    }
    public int dfs(Node root){
        if(root == null)return 0;
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);
        Tsum += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val ;
    }
}
