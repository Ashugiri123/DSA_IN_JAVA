package BinaryTrees;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


//class Node {
//    int val;
//    Node left;
//    Node right;
//
//    Node(int val) {
//        this.val = val;
//    }
//}


//class pair{
//    int dist;
//    Node node;
//    pair(Node node , int dist){
//        this.dist=dist;
//        this.node=node;
//    }}
public class BurningTree {
    static Node start;
    HashMap<Node,Node> map;
    public void dfs(Node root,int target){
        if(root == null)return;
        if(root.val == target )start = root;
        if(root.left != null)map.put(root.left , root);
        if(root.right != null)map.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
    public int minTime(Node root, int target) {
        start = null;
        map = new HashMap<>();
        int finaltime =Integer.MIN_VALUE;
        dfs(root,target);
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(start,0));
        HashSet<Node> burned = new HashSet<>();
        burned.add(start);
        while(q.size()>0){
            pair front = q.remove();
            Node node = front.node;
            int time = front.dist;
            finaltime = Math.max(finaltime,time);
            if(node.left != null && (!burned.contains(node.left))){
                q.add(new pair(node.left,time+1));
                burned.add(node.left);}
            if(node.right != null && (!burned.contains(node.right))){
                q.add(new pair(node.right,time+1));
                burned.add(node.right);}
            if(map.containsKey(node)){
                Node parent = map.get(node);
                if( (!burned.contains(parent))){
                    q.add(new pair(parent,time+1));
                    burned.add(parent);
                }
            }

        }

        return finaltime;


    }
}
