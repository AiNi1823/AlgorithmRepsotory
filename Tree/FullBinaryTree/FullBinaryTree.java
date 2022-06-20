package Tree.FullBinaryTree;

public class FullBinaryTree {
    Node root;

    //Check for Full Binary Tree
    boolean isFullBinaryTree(Node node) {
        //Checking tree emptiness
        if (node == null) {
            return true;
        }

        if ((node.leftChild == null) && (node.rightChild == null)) {
            return true;
        }

        if ((node.leftChild != null) && (node.rightChild != null)) {
            return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));
        }
        return false;
    }

    public static void main(String[] args) {
        FullBinaryTree tree = new FullBinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(6);
        tree.root.rightChild.rightChild = new Node(7);

        if (tree.isFullBinaryTree(tree.root)) {
            System.out.println("The tree is a full binary tree");
        } else {
            System.out.println("The tree is not a full binary tree");
        }
    }
}

class Node {
    int data;
    Node leftChild, rightChild;

    Node(int item) {
        this.data = item;
        leftChild = rightChild = null;
    }
}
