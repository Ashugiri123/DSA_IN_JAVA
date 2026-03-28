package BinaryTrees;

public class NodeDistance {
   static int findDist(Node root, int a, int b) {
        if(root == null){return 0;}
        Node Lca= LCA.lca(root,a,b);
        int[] dis={0,0};
        dfs(Lca,a,b,0,dis);
        return dis[0]+dis[1];

    }
   static void dfs(Node root,int a,int b,int level,int[] dis){
        if(root==null){return ;}
        if(root.val == a){dis[0]=level;}
        if(root.val == b){dis[1]=level;}
        dfs(root.left,a,b,level+1,dis);
        dfs(root.right,a,b,level+1,dis);
    }
}
