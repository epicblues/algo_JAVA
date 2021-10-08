package practice.datastructure.tree;

public class Program {

	public static void main(String[] args) {

//		LinkedTree<Character> T = new LinkedTree<Character>();
//
//		TreeNode<Character> n7 = T.makeBT(null, 'D', null);
//		TreeNode<Character> n6 = T.makeBT(null, 'C', null);
//		TreeNode<Character> n5 = T.makeBT(null, 'B', null);
//		TreeNode<Character> n4 = T.makeBT(null, 'A', null);
//		TreeNode<Character> n3 = T.makeBT(n6, '*', n7);
//		TreeNode<Character> n2 = T.makeBT(n4, '/', n5);
//		TreeNode<Character> n1 = T.makeBT(n2, '-', n3);
//
//		T.postOrder(n1);
//		System.out.println();
//
//		T.inOrder(n1);
//		System.out.println();
//		T.preOrder(n1);
//		System.out.println();

		
		BinarySearchTree<String> bst = new BinarySearchTree<String>();
		bst.insertBST("baka");
		bst.insertBST("pizzamaur");
		bst.insertBST("baku");
		
		bst.printBST();
		bst.insertBST("bakav");
		bst.insertBST("pizzamaurz");
		bst.insertBST("bakud");
		bst.printBST();
		
		System.out.println("Searching : "  + bst.searchBST("bakav").data);
	}

}
