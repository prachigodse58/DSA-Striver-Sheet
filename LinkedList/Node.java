package LinkedList;

class Node {
	int data ;
	Node next ;
	Node(int data1, Node next1){
		this.data = data1; 
		this.next= next1;
	}
	Node(int data1 ){
		this.data = data1;
		this.next= null;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,6,8};
		Node y = new Node(arr[3]);
		System.out.println(y.data);
	}
}
