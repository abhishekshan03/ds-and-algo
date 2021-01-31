package revelcorps.topics.trees;

public class ValidateBST {

    public static boolean verifyBST (TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.getValue()< min) || (max != null && node.getValue() > max)) {
            return false;
        }

        return verifyBST(node.getLeftChild( ), min, node.getValue()) && verifyBST(node.getRightChild(), node.getValue(), max);
    }

    public static void main(String[] args) {
        System.out.println("Starting demo ....");
        TreeHandler th = new TreeHandler();
        //th.createTree();
        TreeNode root = th.createSampleTree();
        System.out.println("Tree created !!!!");
        th.levelOrderTraverse(root);

        boolean result =  ValidateBST.verifyBST(root, null, null);
        System.out.println("Is tree BST "+ result );
    }
}
