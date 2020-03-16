public class RangeSumOfBST {

    public static TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return (new TreeNode(data));
        } else {

            if (data <= node.val) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {

        int sum = 0;

        if (root > r) {

        } else if (root < l)



        return sum;
    }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(10);

        System.out.println(rangeSumBST(first, 7, 15));

    }
}