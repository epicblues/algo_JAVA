package practice.datastructure.linkedlist;

public class AddressList {
	private AddressNode head;

	public AddressList() {
		head = null;
	}

	public void insert(AddressNode newNode) {
		if (head == null) {
			head = newNode;
			return;
		}

		AddressNode temp = head;
		while (temp.link != null) {
			temp = temp.link;
		}
		temp.link = newNode;
		return;
	}

	public void printList() {
		AddressNode temp = head;
		if (temp == null)
			System.out.println("This list is empty");
		else {
			System.out.println(temp);
			while (temp.link != null) {

				temp = temp.link;
				System.out.println(temp);
			}
		}
	}

	public void searchAndDeleteNode(String name) {
		if (head == null)
			return;
		if (head.getName().equals(name)) {
			head = head.link;
			return;
		}

		AddressNode pre = head;
		AddressNode temp = head.link;
		while (temp != null) {
			if (temp.getName().equals(name)) {
				pre.link = temp.link;
				return;
			}
			pre = pre.link;
			temp = pre.link;
		}

	}
}
