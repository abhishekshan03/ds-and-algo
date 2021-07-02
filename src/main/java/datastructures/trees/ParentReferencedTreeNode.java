package datastructures.trees;

public class ParentReferencedTreeNode extends TreeNode {
    protected ParentReferencedTreeNode  parent;

    public ParentReferencedTreeNode getParent () {
        return parent;
    }

    public  void setParent (ParentReferencedTreeNode parent) {
        this.parent = parent;
    }
}
