package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public  void dfs(Node root, List<String> arr, StringBuilder sb) {
        if (root == null) return;

        int len = sb.length();

        sb.append(root.val);

        if (root.left == null && root.right == null) {
            arr.add(sb.toString());
        } else {
            sb.append("->");
            dfs(root.left, arr, sb);
            dfs(root.right, arr, sb);
        }

        sb.setLength(len);
    }




    public  ArrayList<String> binaryTreePaths(Node root) {
        if(root == null){return new ArrayList<>();}
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(root,list,sb);
        return list;
    }
}
