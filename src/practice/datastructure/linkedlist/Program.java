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
		
		AddressList addList = new AddressList();
		addList.insert(new AddressNode("kms", "010-222-444", "hanmail.net"));
		addList.insert(new AddressNode("kms2", "010-222-444", "hanmail.net"));
		addList.insert(new AddressNode("kms3", "010-222-444", "hanmail.net"));
		addList.insert(new AddressNode("kms4", "010-222-444", "hanmail.net"));
		addList.insert(new AddressNode("kms5", "010-222-444", "hanmail.net"));
		
		addList.searchAndDeleteNode("kms5");
		addList.searchAndDeleteNode("kms2");
		addList.searchAndDeleteNode("kms4");
		addList.searchAndDeleteNode("kms3");
		addList.searchAndDeleteNode("kms");
		addList.printList();
	}

}
