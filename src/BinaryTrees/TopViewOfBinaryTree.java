package BinaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
class pair{
    int dist;
    Node node;
    pair(Node node , int dist){
        this.dist=dist;
        this.node=node;
    }}
public class TopViewOfBinaryTree {
    public ArrayList<Integer> topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(new pair(root,0));
        int mindist =Integer.MAX_VALUE;
        int maxdist=Integer.MIN_VALUE;
        while(q.size()>0){
            pair front = q.remove();
            int dist = front.dist;
            Node node = front.node;
            mindist = Math.min(mindist,dist);
            maxdist = Math.max(maxdist,dist);
            if(!map.containsKey(dist))map.put(dist,node.val);
            if(node.left != null)q.add(new pair(node.left,dist-1));
            if(node.right != null)q.add(new pair(node.right,dist+1));
        }
        for(int i= mindist;i<=maxdist;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
