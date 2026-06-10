package Heaps;
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class IsBinaryTreeHeap {
    static int s;
    public static int size(Node root){
        if(root == null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static boolean isMaxHeap(Node root){
        if(root == null)return true;
        int leftTree =(root.left!=null)?root.left.data:Integer.MIN_VALUE;
        int RightTree =(root.right!=null)?root.right.data:Integer.MIN_VALUE;
        if(leftTree > root.data || RightTree > root.data)return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }


    public static boolean isComplete(Node root,int idx) {
        if(root == null)return true;
        if(idx>s)return false;
        return isComplete(root.left,idx*2) && isComplete(root.right,(idx*2)+1);
    }
    public static boolean isHeap(Node root) {
        s=size(root);
        return isComplete(root,1) && isMaxHeap(root);

    }


}
