package trees;

public class TreeDemo {
    public static void main(String[] args) {
        System.out.println("Starting demo ....");
        TreeHandler th = new TreeHandler();
        //th.createTree();
        TreeNode root = th.createSampleTree();
        System.out.println("Tree created !!!!");
        th.levelOrderTraverse(root);

        VerifyBalanceBinaryTree.Result result =  VerifyBalanceBinaryTree.verifyBalance(root);
        System.out.println("Is tree balance "+ result.isNodeBalanced );
    }
}
