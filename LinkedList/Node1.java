package LinkedList;

public class Node1 {
	int data;
	Node1 next;
	Node1(int data1, Node1 next1){
		this.data= data1;
		this.next= next1;
	}
	Node1(int data1){
		this.data= data1;
		this.next=null;
	}
    private static Node1 LinkedList(int [] arr){
    	Node1 head= new Node1(arr[0]);
    	Node1 mover = head ;
    	for (int i = 0; i < arr.length; i++) {
			Node1 temp = new Node1(arr[i]) ;
			mover= temp;
		}
    	return head;
    }
public static void main(String[] args) {
	int arr[]= {2,5,6,7,9,};
	Node1 head = LinkedList(arr);
	System.out.println(head.data);
	
}
}
