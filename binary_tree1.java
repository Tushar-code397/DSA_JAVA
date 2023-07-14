
import java.io.IOException;
import java.util.*;

public class binary_tree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;

        }

        // preorder traversal

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // inorder traversal

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // postorder traversal

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order traversal

        public static void levelorder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currnode = q.remove();

                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }

        }

        // height of tree
        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        // count the no of nodes
        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int rcount = count(root.right);
            int lcount = count(root.left);
            return lcount + rcount + 1;
        }

        // sum of nodes of tree
        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsum = sum(root.left);
            int rightsum = sum(root.right);

            return leftsum + rightsum + root.data;

        }

    }

    public static void main(String args[]) throws IOException {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);

        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postorder(root);
        // tree.levelorder(root);

        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));

    }
}
