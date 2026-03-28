package BinaryTrees;

import java.util.*;


class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class Pair {
    Node node;
    int level;

    Pair(Node node,int val) {
        this.node =node;
        this.level = val;
    }
}

public class Implementation {

    private static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) {
                q.add(front.left);
            }
            if (front.right != null) {
                q.add(front.right);
            }
        }
        System.out.println();
    }

    private static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.add(new Pair(root, 0));

        while (q.size() > 0) {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if (level != currentLevel) {
                currentLevel++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if (node.left != null) {
                q.add(new Pair(node.left, level + 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, level + 1));
            }
        }
        System.out.println();
    }


    private static void kThLevel(Node root, int level, int k) {
        if (root == null) return;
        if (level == k) {
            System.out.print(root.val + " ");}
            kThLevel(root.left, level + 1, k);
            kThLevel(root.right, level + 1, k);

    }


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(-1);
        Node g = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        display(a);
        System.out.println();
        System.out.println(size(a));
        levelOrder(a);
        levelOrderLineWise(a);
        kThLevel(a, 0, 1);
        System.out.println();
        BinaryTreePaths obj =new BinaryTreePaths();
        ArrayList<String> arr= obj.binaryTreePaths(a);
        System.out.println(arr);

        Node ans = LCA.lca(a,5,7);
        System.out.println(ans.val);

        System.out.println(NodeDistance.findDist(a,7,9));

        FlattenBinaryToLinkedList.flatten(a);
        ArrayList<String> arr1= obj.binaryTreePaths(a);
        System.out.println(arr1);

        System.out.println("new BinaryTree constructed by inorder and postorder:");
        int[] inOrder={9,3,15,20,7};
        int[] postOrder={9,15,7,20,3};
        Node ConstructedTree=ConstructBinaryTreeByPostAndInOrder.buildTree(inOrder,postOrder);
        ArrayList<String> arr2= obj.binaryTreePaths(ConstructedTree);
        System.out.println(arr2);

    }
}
