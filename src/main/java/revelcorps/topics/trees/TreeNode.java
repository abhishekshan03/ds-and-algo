package revelcorps.topics.trees;

public class TreeNode {

    protected int value;
    protected TreeNode leftChild;
    protected TreeNode rightChild;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public TreeNode() {
    }

    public TreeNode (int value) {
        this.value = value;
    }
}
