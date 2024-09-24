package LinkedList;

public class Node3 {

		int data;
		Node3 next;
		Node3(int data1, Node3 next1){
			this.data= data1;
			this.next= next1;
		}
		Node3(int data1){
			this.data= data1;
			this.next=null;
		}
	public static Node3 deleteHead(Node3 head) {	
		
		if(head==null) return head;
		head = head.next;
		return head;	
	}
	public static Node3 arrToLL(int arr[]) {
		Node3 head = new Node3(arr[0]);
		Node3 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node3 temp =new Node3(arr[i]);
			mover.next= temp;
			mover = temp;
		}
		return head;
	}
	public static Node3 DeleteK(Node3 head, int k) {
		Node3 temp = head;
		if (head == null) return null;
		if(k==1) {
			head = temp.next;
			return head;
		}
		int cnt = 0; Node3 prev = null;	
		while( temp != null ) {
			if(cnt == k) {		
				prev.next = prev.next.next;
				return head;
			}
			cnt++;
			prev= temp;
			temp= temp.next;
		}
		return head;
	}
	public static Node3 Value(Node3 head, int k) {
		Node3 temp = head;
		if (head == null) return null;
		if (head.data == k) {
			head= temp.next;
			return head;
		}
		Node3 prev = null;		
		int cnt = temp.data; 
		while( temp != null ) {
			if(cnt == k) {		
				prev.next = prev.next.next;
				return head;
			}
			
			prev= temp;
			temp= temp.next;
		}
		return head;
	}
	public static Node3 removeTail(Node3 head) {
		if(head == null || head.next==null) return null;
		Node3 temp = head;
		while(temp.next.next != null) {
			 temp= temp.next;
		}
		temp.next= null;
		return head;
	}
	
	public static Node3 insertElem( int val ,Node3 head) {
		Node3 temp = new Node3(val,head); 
		return temp;
	}
	public static void print(Node3 head) {
		Node3 temp = head ;
		while(temp!=null) {
			System.out.print(temp.data + ", ");
			temp= temp.next;
		}
	}
	public static Node3 insertTail(Node3 head , int val) {
		if(head == null) {
			Node3 newNode = new Node3(val);
	        return newNode;
		}
		Node3 temp = head;
		while(temp!=null) {
			if(temp.next==null) {
				break;
			}
			temp= temp.next;
		}
		Node3 newNode = new Node3(val);
        temp.next= newNode;
		return head;
	}
	public static Node3 insertEl(Node3 head,int val,int k) {
		if (head==null) {
			Node3 newNode =new Node3(val);
			return newNode;
		}
		if(k==1) {
			Node3 newNode = new Node3(val,head);
			return newNode;
		}
		int cnt=0;
		Node3 temp = head;
		while(temp.next!= null) {
			cnt++;
			if(cnt==k-1) {
				Node3 newNode= new Node3(val,temp.next);
				temp.next= newNode;
				break;
			}
			temp=temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,6,7,8};
		int k = 2;
		int val = 100;
		Node3 head = arrToLL(arr);
//		head = deleteHead(head);
//		head = removeTail(head);
//		head = DeleteK(head,k);
//		head = Value(head,k);
//		head = insertElem(val, head);
//		head = insertTail(head, val);
//		head = insertEl(head,val,k);
		Node3 temp = head;
		System.out.print("{");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println("}");
//		print(head);
	}
	}


