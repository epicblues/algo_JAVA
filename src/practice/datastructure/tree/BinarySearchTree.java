package practice.datastructure.tree;

import java.util.Comparator;

import org.springframework.util.comparator.ComparableComparator;

public class BinarySearchTree<T extends Comparable<T>> {
	private TreeNode<T> root;
	private final Comparator<T> comparator = new ComparableComparator<T>();

	public TreeNode<T> insertKey(TreeNode<T> root, T key) {

		TreeNode<T> p = root;
		
		if (p == null) {
			TreeNode<T> newNode = new TreeNode<T>();
			newNode.data = key;
			newNode.left = null;
			newNode.right = null;
			p = newNode;
		} else if (comparator.compare(key, p.data) == 0) {
			System.out.println("이미 해당 key가 존재합니다.");
		} else if (comparator.compare(key, p.data) > 0) {
			
			p.right = insertKey(p.right, key);
		} else {
			p.left = insertKey(p.left, key);
		}

		return p;
	}
	
	
	public void inOrder(TreeNode<T> root) {
		if (root == null) {
			return;
		} else {
			inOrder(root.left);
			System.out.print(root.data + "/");
			inOrder(root.right);
		}
	}
	
	public void insertBST(T data) {
		root = insertKey(root,data);
	}
	
	public TreeNode<T> searchBST(T key) {
		TreeNode<T> p = root;
		while(p != null) {
			if(comparator.compare(key, p.data) == 0) {
				return p;
			} else if(comparator.compare(key, p.data) > 0) {
				p = p.right;
			} else {
				p = p.left;
			}
		}
		
		return p;
	}


	public void printBST() {
		inOrder(root);
		System.out.println();
	}
	
	
}
