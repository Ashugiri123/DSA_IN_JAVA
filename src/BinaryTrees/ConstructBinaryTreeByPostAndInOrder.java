package BinaryTrees;

public class ConstructBinaryTreeByPostAndInOrder {
    public static Node buildTree(int[] inorder, int[] postorder) {
        if(inorder.length <= 0)return null;
        int n=inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public  static Node build(int inLo,int inHi,int postLo,int postHi,int[] inor,int[] postor ){
        if(postLo > postHi  || inLo > inHi)return null;

        int n=inor.length;
        int val=postor[postHi];
        Node root = new Node(val);
        int r=0;
        for(int i=0;i<n;i++){
            if(inor[i] == val){
                r=i;
                break;
            }
        }
        int cnt= r-inLo;
        root.left = build(inLo, r - 1, postLo, postLo + cnt - 1, inor, postor);
        root.right = build(r + 1, inHi, postLo + cnt, postHi - 1, inor, postor);
        return root;
    }
}
