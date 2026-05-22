package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BSTtoGreaterTree {

        public void dis(Node root, List<Integer> ans) {
            if (root == null) return;

            dis(root.left, ans);
            ans.add(root.val);
            dis(root.right, ans);
        }

        public void fill(Node root, List<Integer> ans, int[] index) {
            if (root == null) return;

            fill(root.left, ans, index);
            root.val = ans.get(index[0]);
            index[0]++;
            fill(root.right, ans, index);
        }

        public Node convertBST(Node root) {
            if (root == null) return null;

            ArrayList<Integer> ans = new ArrayList<>();

            dis(root, ans);

            for (int i = ans.size() - 2; i >= 0; i--) {
                ans.set(i, ans.get(i) + ans.get(i + 1));
            }


            int[] index = new int[1];
            fill(root, ans, index);

            return root;
        }
    }
