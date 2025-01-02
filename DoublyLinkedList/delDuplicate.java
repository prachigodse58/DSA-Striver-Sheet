package DoublyLinkedList;

public class delDuplicate {
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data , Node next,Node prev){
			this.data= data;
			this.next= next;
			this.prev= prev;
		}
		Node(int data){
			this.data= data;
			this.next= null;
			this.prev = null;
		}

	}
	public static void printLL(Node head) {
		Node temp = head;

		while(temp!=null) {
			System.out.print(temp.data +" ");

			temp= temp.next;
		}
		System.out.println();
	}
	public static Node delDuplicate(Node head) { 
		Node temp = head;
		Node mover = temp;

		while(mover!=null) {
			if(mover.next == null) {
				temp.next= null;
			}
			if(temp.data == mover.data ) {
				mover= mover.next;
			}
			else {
				temp.next=mover;
				mover.prev=temp;

				temp=temp.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.prev = head;

		head.next.next = new Node(1);
		head.next.next.prev = head.next;

		head.next.next.next = new Node(2);
		head.next.next.next.prev = head.next.next;

		head.next.next.next.next = new Node(3);
		head.next.next.next.next.prev = head.next.next.next;

		head.next.next.next.next.next = new Node(3);
		head.next.next.next.next.next.prev = head.next.next.next.next;

		System.out.println("Original List:");
		printLL(head);

		Node ans = delDuplicate(head);
		printLL(ans);
	}
}
