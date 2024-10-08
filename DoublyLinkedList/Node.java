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
	public static Node deleteTail(Node head) {

		if (head == null || head.next==null) {
			return null;
		}
		Node tail = head;
		while (tail.next != null) {
			tail=tail.next;
		}
		Node prev = tail.back;
		tail.back=null;
		prev.next= null;

		return head;
	}

	public static Node deleteKthElem(Node head, int k) {
		Node temp = head ;

		int cnt= 0;
		if (head== null || head.next == null) {
			return null;
		}	
		while(temp!=null) {
			cnt++;
			temp = temp.next;

			if(cnt== k) {
				break;
			}
		}
		Node prev = temp.back;
		Node front= temp.next;
		if(prev== null ) {}
		else if(front==null) {
			head= deleteTail(head);
		}
		prev.next = front;
		front.back= prev;
		temp.next= null;
		temp.back = null;
		return head;
	}

	public static void deleteNode1(Node temp) {

		Node prev = temp.back;
		Node front = temp.next;
		if(front == null) {
			prev.next = null;
			temp.back= null;
		}
		prev.next = front;
		front.back= prev;
		temp.next=temp.back=null;
	}

	public static Node insertHead(Node head,int val) {

		Node newNode = new Node(val,head,null);
		head.back=newNode;
		newNode.next= head;
		newNode.back= null;

		return newNode;
	}

	public static Node insertNode(Node head , int val) {
		
		Node tail = head;
		Node newNode = new Node(val);

		while(tail.next != null) {
			tail=tail.next;
		}
		
		Node prev = tail.back;
		
		newNode.next= tail;
		newNode.back = prev;
        prev.next=newNode;
		tail.back= newNode;
		return head;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,6,7,8};
		Node head = ArrToDLL(arr);
		//		head =deleteNode(head);
		//		head = deleteTail(head);
		int k = 2;
		//		head = deleteKthElem(head, k);
		//		deleteNode1(head.next.next);
		//		head = insertHead(head, 1);
		head = insertNode(head , 10);
		print(head);
	}
}
