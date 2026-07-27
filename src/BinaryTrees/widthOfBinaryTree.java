package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
//class pair{
//    int index;
//    Node node;
//    pair(Node node,int index){
//        this.index = index;
//        this.node = node;
//    }}
public class widthOfBinaryTree {
    public int widthOfBinaryTree(Node root) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int ans = Integer.MIN_VALUE;
        while(q.size()>0){
            int size = q.size();
            int first =0;
            int last = 0;
            int min = q.peek().dist;
            for(int i=0;i<size;i++){
                pair curr = q.remove();
                Node node = curr.node;
                int idx = curr.dist-min;
                if(i==0){
                    first = idx;
                }if(i==size-1){
                    last = idx;
                }
                if(node.left != null)q.add(new pair(node.left,2*idx));
                if(node.right != null)q.add(new pair(node.right,2*idx+1));

            }ans = Math.max(ans,(last-first)+1);
        }return ans;
    }}

