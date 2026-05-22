package BinaryTrees;

public class SortedArrayToBST {
    public Node sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int n = nums.length;
        return newTree(nums, 0, n - 1);
    }

    public Node newTree(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) / 2;
        Node root = new Node(nums[mid]);
        root.left = newTree(nums, lo, mid - 1);
        root.right = newTree(nums, mid + 1, hi);
        return root;
    }
}