package BinaryTrees;

class quad{
    int max;
    int min;
    boolean isBST;
    int size;
    quad(int max,int min,boolean isBST, int size){
        this.max=max;
        this.min = min;
        this.isBST = isBST;
        this.size = size;
    }
}

public  class MaximumSumBSTinBinaryTree {
        static int maxSize;
        public int maxSumBST(Node root) {
            maxSize = 0 ;
            helper(root);
            return maxSize;
        }

        static quad helper(Node root){
            if(root == null)return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0);
            quad lst = helper(root.left);
            quad rst = helper(root.right);
            int max = Math.max(root.val,Math.max(lst.max,rst.max));
            int min = Math.min(root.val,Math.min(lst.min,rst.min));

            int size = root.val+lst.size+rst.size;
            boolean isBST = (lst.isBST) && (rst.isBST) && (lst.max<root.val) && (rst.min >root.val);
            if(isBST){ maxSize=Math.max(maxSize,size);}
            return new quad(max,min,isBST,size);
        }
}
