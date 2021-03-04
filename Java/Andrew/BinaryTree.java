import java.util.ArrayList;

public class BinaryTree {
    Node root;

    /* This function traverse the skewed binary tree and 
    stores its nodes pointers in ArrayList nodes*/
    void storeBSTNodes(Node root, ArrayList<Node> nodes) {
        if (root == null)
            return;

        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }

    /* Recursive function to construct binary tree */
    Node buildTreeUtil(ArrayList<Node> nodes, int start, int end) {
        // base case 
        if (start > end)
            return null;

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);

        /* Using index in Inorder traversal, construct 
        left and right subtress */
        node.left = buildTreeUtil(nodes, start, mid - 1);
        node.right = buildTreeUtil(nodes, mid + 1, end);

        return node;
    }

    // This functions converts an unbalanced BST to 
    // a balanced BST 
    Node buildTree(Node root) {
        // Store nodes of given BST in sorted order 
        ArrayList<Node> nodes = new ArrayList<Node>();
        storeBSTNodes(root, nodes);

        // Constucts BST from nodes[] 
        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n - 1);
    }

    /* Function to do preorder traversal of tree */
    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}