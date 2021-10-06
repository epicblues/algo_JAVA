package practice.datastructure.linkedlist;

public class Program {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLastNode("babo");
		list.addLastNode("chunjae");
		list.addLastNode("pingshin");
		list.printList();
		
		
		ListNode chunjae= list.searchNode("babo");
		list.insertMiddleNode(chunjae, "kmspinshing");
		
		list.printList();
		list.deleteLastNode();
		list.deleteLastNode();
		list.deleteLastNode();
		list.deleteLastNode();
		
		list.printList();
		list.addLastNode("babo");
		list.addLastNode("chunjae");
		list.addLastNode("pingshin");
		list.addLastNode("baka");
		list.addLastNode("oya");
		
		list.printList();
		list.reverseList();
		list.printList();
	}

}
