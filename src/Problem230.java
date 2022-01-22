public class Problem230 {
    private int ans;
    private int current = 0;
    public int kthSmallest(TreeNode root, int k) {
        current = 0;
        kthSmallestUtil(root, k);
        return ans;
    }
    public void kthSmallestUtil(TreeNode root, int k){
        if (root == null){
            return;
        }
        kthSmallestUtil(root.left, k);
        current++;
        if (current == k){
            ans = root.val;
        }
        kthSmallestUtil(root.right, k);
    }
}
