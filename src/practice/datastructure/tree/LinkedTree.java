package practice.datastructure.tree;

public class LinkedTree<T> {
	TreeNode<T> root;

	public TreeNode<T> makeBT(TreeNode<T> bt1, T data, TreeNode<T> bt2) {
		root = new TreeNode<T>();
		root.data = data;
		root.left = bt1;
		root.right = bt2;

		return root;
	}

	public void preOrder(TreeNode<T> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data);
		preOrder(root.left);
		preOrder(root.right);

	}

	public void inOrder(TreeNode<T> root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);

	}

	public void postOrder(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data);

	}
}
