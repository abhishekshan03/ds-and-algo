package datastructures.trees;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class TreeHandler {
    private TreeNode root;
    Scanner console = new Scanner(System.in);

    public TreeNode createTree () {
        TreeNode root = new TreeNode();
        System.out.println("Enter  value for root node");
        int x = console.nextInt();
        if (x != -1) {
            root.setValue(x);
            this.root = root;
            return createInternal(root);
        } else {
            System.out.println("Invalid value for root node: "+x);
            return null;
        }
    }

    private TreeNode createInternal (TreeNode parent) {

        System.out.println(String.format("Enter value for left child for parent = %s [%s]",
                parent.getValue(), parent));
        int x = console.nextInt();
        if (x != -1) {
            TreeNode node = new TreeNode();
            node.setValue(x);
            parent.setLeftChild(node);
            createInternal(node);
        } else {
            System.out.println("Invalid value provided. Skipping ...");
        }

        System.out.println(String.format("Enter value for right child for parent = %s [%s]",
                parent.getValue(), parent));
        int y = console.nextInt();
        if (y != -1) {
            TreeNode node = new TreeNode();
            node.setValue(y);
            parent.setRightChild(node);
            createInternal(node);
        } else {
            System.out.println("Invalid value provided. Skipping ...");
        }
        return parent;
    }

    public void levelOrderTraverse () {
        if (this.root == null) {
            createTree();
        }
        levelOrderTraverse(this.root);
    }
    public void levelOrderTraverse (TreeNode root) {

        Queue<TreeNode> queue = new ArrayBlockingQueue(10000);
        int flag;
        int nodeCounter = 0;
        int expo = 0;
        //since we are starting with root node, lets count!
        nodeCounter++;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode entry = queue.poll();
            flag = (int)Math.pow(2,expo);
            if (nodeCounter == flag) {
                TreeNode node = new TreeNode();
                node.setValue(-11);
                queue.add(node);
                expo++;
                nodeCounter = 0; //reset the node counter
            }

            if (entry.getValue() == -11) {
                System.out.print("\n");
                continue;
            }
            System.out.print(entry.getValue() + "\t");

            TreeNode lChild = entry.getLeftChild();
            nodeCounter++;
            if (lChild != null) {
                queue.add(lChild);
            }
            TreeNode rChild = entry.getRightChild();
            nodeCounter++;
            if (rChild != null) {
                queue.add(rChild);
            }
        }
    }

    public TreeNode createSampleTree () {
        TreeNode root = new TreeNode(50);

        root.setLeftChild(new TreeNode(40));
        root.setRightChild(new TreeNode(80));

        root.getLeftChild().setLeftChild(new TreeNode(30));
        root.getLeftChild().setRightChild(new TreeNode(42));

        root.getRightChild().setLeftChild(new TreeNode(75));
        root.getRightChild().setRightChild(new TreeNode(90));

        return root;
    }

    /*
    public ParentReferencedTreeNode createSampleTree () {
        ParentReferencedTreeNode root ;

        root.setLeftChild(new TreeNode(40));
        root.setRightChild(new TreeNode(80));

        root.getLeftChild().setLeftChild(new TreeNode(30));
        root.getLeftChild().setRightChild(new TreeNode(42));

        root.getRightChild().setLeftChild(new TreeNode(75));
        root.getRightChild().setRightChild(new TreeNode(90));

        return root;
    }

     */
}

/*
                A
       B                 C
  D        E       F            G



    D E F G

    A B C
 */
