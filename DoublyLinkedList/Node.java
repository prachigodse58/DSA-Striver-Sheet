package DoublyLinkedList;
import LinkedList.Node3;

public class Node {
	int data;
	Node next;
	Node back;
	Node(int data1, Node next1 , Node back1){
		this.data= data1;
		this.next= next1;
		this.back= back1;
	}
	Node(int data1){
		this.data= data1;
		this.next=null;
		this.back = null;
	}
	
	public static Node ArrToDLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node prev = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i],null,prev);
			prev.next= temp;
			prev = temp;
		}
		return head;
	}
	
	public static void print(Node head) {
		while (head!=null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		System.out.println();
	}
	
	public static Node deleteNode(Node head) {
		
		if(head==null || head.next==null) {
			return null;
		}
		Node prev= head; 
		head= head.next;
		prev.next = null;
		head.back= null;
		
		return head;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,6,7,8};
		Node head = ArrToDLL(arr);
		head =deleteNode(head);
		print(head);

	}
}
