public class BalanceTree {
    public static void main(String[] args) 
	{ 
		/* Constructed skewed binary tree is 
				10 
			   / 
			  8 
			 / 
			7 
		   / 
		  6 
		 / 
		5 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(7);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.left.left = new Node(5);

		tree.root = tree.buildTree(tree.root); 
		System.out.println("Preorder traversal of balanced BST is :"); 
		tree.preOrder(tree.root); 
	} 
}
