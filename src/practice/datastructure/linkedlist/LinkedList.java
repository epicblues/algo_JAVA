package practice.datastructure.linkedlist;

public class LinkedList {

	public ListNode head;

	public LinkedList() {
		this.head = null;
	}

	public void addLastNode(String data) {
		ListNode newNode = new ListNode(data);
		ListNode next = null;
		if (head == null) {
			head = newNode;
			return;
		} else if (head.link == null) {
			head.link = newNode;
			return;
		} else {
			next = head.link;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}

	public void printList() {
		ListNode next = null;
		if (head == null) {
			System.out.println("No nodes");
			return;
		}

		int i = 1;
		next = head;
		while (next != null) {
			System.out.printf("%d번쨰 value : %s%n", i, next.getData());
			i++;
			next = next.link;
		}
	}

	public void insertMiddleNode(ListNode pre, String data) {
		// n 번째 노드 주소 구하기
		ListNode temp = head;
		ListNode newNode = new ListNode(data);
		while (temp != null) {
			if (temp.getData().equals(pre.getData())) {
				newNode.link = temp.link;
				temp.link = newNode;
				return;
			}
			temp = temp.link;
		}
	}

	public ListNode searchNode(String data) {

		ListNode temp = head;
		while (temp != null) {
			if (temp.getData().equals(data))
				return temp;
			temp = temp.link;
		}
		
		return null;
	}

	public void deleteLastNode() {

		if (head == null)
			return;
		if (head.link == null) {
			head = null;
			return;
		}
		// 최소 2개의 노드 존재
		ListNode temp = head;

		while (true) {
			ListNode next = temp.link;
			if (next.link == null) { // next가 마지막 노드다.
				temp.link = null; // 마지막 node인 next 제거
				break;
			}
			temp = next;
		}

	}

	public void reverseList() {
		if (head == null || head.link == null) return;
		// 노드에는 최소 2개 이상.
		ListNode beforeTemp = head;
		ListNode temp = head.link;
		beforeTemp.link = null;
		
		while(temp!=null) {
			ListNode afterTemp = temp.link; // 현재 temp 노드의 주소 값을 임시 저장.
			
			temp.link = beforeTemp;
			beforeTemp = temp;
			temp = afterTemp;
			
		}
		head = beforeTemp; // 마지막 노드의 주소를 시작점으로 삼는다.
		

	}
}
