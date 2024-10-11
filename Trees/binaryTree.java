package PrepDSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {

    static Queue<Node> q = new LinkedList<>();
    static Node root = null;

    static class Node {
        public int data;
        public Node right;
        public Node left;
    }

    static Node newNode(int data) {
        Node nNode = new Node();
        nNode.data = data;
        nNode.right = null;
        nNode.left = null;
        return nNode;
    }

    static void createTree(int []arr, int n) {
        for (int i = 0; i < n; i++) {
            insertValue(arr[i]);
        }
    }

    static void insertValue(int value) {
        Node newNode = newNode(value);

        if (root == null)
            root = newNode;
        else if (q.peek().left == null){
            q.peek().left = newNode;
        } else {
            q.peek().right = newNode;
            q.remove();
        }
        q.add(newNode);
    }

    static void levelOrder(Node root)
    {
        if (root == null)
            return;
        Queue<Node> n =
                new LinkedList<>();
        n.add(root);
        while (!n.isEmpty())
        {
            System.out.print(n.peek().data +
                    " ");
            if (n.peek().left != null)
                n.add(n.peek().left);
            if (n.peek().right != null)
                n.add(n.peek().right);
            n.remove();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {10, 20, -1,
                40, 50, 60};
        int n = arr.length;
        createTree(arr, n);
        levelOrder(root);
    }
}
