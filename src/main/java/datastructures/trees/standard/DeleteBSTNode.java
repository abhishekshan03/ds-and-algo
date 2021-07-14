package datastructures.trees.standard;

import datastructures.trees.TreeNode;

public class DeleteBSTNode {
    public TreeNode deleteNode (TreeNode root, int key)
    {
        if (root != null) {
            if (key < root.getValue())
                root.setLeftChild(deleteNode(root.getLeftChild(), key));
            else if (key > root.getValue())
                root.setRightChild(deleteNode(root.getRightChild(), key));
            else {
                if (root.getLeftChild() == null && root.getRightChild() == null)
                    root = null;
                else if (root.getRightChild() == null) {
                    TreeNode temp = root;
                    root = root.getLeftChild();
                    temp.setLeftChild(null);
                } else if (root.getLeftChild() == null) {
                    TreeNode temp = root;
                    root = root.getRightChild();
                    temp.setRightChild(null);
                } else {
                    TreeNode tmp = findMin(root.getRightChild());
                    root.setValue(tmp.getValue());
                    root.setRightChild(deleteNode(root.getRightChild(), tmp.getValue()));
                }
            }
        }
        return root;
    }

    private TreeNode findMin(TreeNode p)
    {
        TreeNode q = null;
        while (p != null) {
            q = p;
            p = p.getLeftChild();
        }
        return q;
    }
}
