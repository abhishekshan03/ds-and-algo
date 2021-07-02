package datastructures.trees;

public class NextSuccessor {

    public static TreeNode getNextSuccessor (ParentReferencedTreeNode  node) {
        ParentReferencedTreeNode parent = node.getParent();

        if (isLeafNode(node) ) {
            if (isLeftChild(parent, node)) {
                return parent;
            } else {
                return getLeftChildParent(node);
            }
        } else {
            if (node.getRightChild() != null) {
                if (isLeafNode(node.getRightChild())) {
                    return node.getRightChild();
                } else {
                    return findMinimumNode(node.getRightChild());
                }
            } else {
                return getLeftChildParent(node);
            }
        }
    }

    private static boolean isLeftChild (ParentReferencedTreeNode parent, ParentReferencedTreeNode child) {
        return parent.getLeftChild() == child;
    }

    private static boolean isRightChild (ParentReferencedTreeNode parent, ParentReferencedTreeNode child) {
        return parent.getRightChild() == child;
    }

    private static boolean isLeafNode (TreeNode node) {
        return node.getLeftChild() == null && node.getRightChild() == null;
    }

    private static ParentReferencedTreeNode getLeftChildParent (ParentReferencedTreeNode node) {
        ParentReferencedTreeNode result = null;
        while (node != null && node.getParent() != null) {
            ParentReferencedTreeNode parent = node.getParent();
            if (parent.getParent().getLeftChild() == parent) {
                result = node;
                break;
            } else {
                node = parent;
            }
        }
        return result;
    }

    private static TreeNode findMinimumNode (TreeNode node) {

        while (node != null) {
            node = node.getLeftChild();
        }
        return node;
    }

    public static void main (String[] args) {
        System.out.println("Starting  ....");
        TreeHandler th = new TreeHandler();
        //th.createTree();
        TreeNode root = th.createSampleTree();
        System.out.println("Tree created !!!!");
        th.levelOrderTraverse(root);

        boolean result =  ValidateBST.verifyBST(root, null, null);
        System.out.println("Is tree BST "+ result );

        TreeNode node = getNextSuccessor((ParentReferencedTreeNode)root);
        System.out.println("Next successor is "+ node.getValue());
    }
}
