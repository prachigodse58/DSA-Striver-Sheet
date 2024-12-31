package DoublyLinkedList;

public class deleteRepeating {
	
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
	 
	   public static Node delete(Node head, int key) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.data == key) {
	                if (temp == head) {
	                    head = head.next;
	                    if (head != null) head.prev = null;
	                } else {
	                    Node nextNode = temp.next;
	                    Node prevNode = temp.prev;

	                    if (nextNode != null) nextNode.prev = prevNode;
	                    if (prevNode != null) prevNode.next = nextNode;
	                }
	                temp = temp.next;
	            } else {
	                temp = temp.next;
	            }
	            
	        }
	        return head;
	    }
public static void main(String[] args) {
	 Node head = new Node(10);
     head.next = new Node(9);
     head.next.prev = head;

     head.next.next = new Node(2);
     head.next.next.prev = head.next;

     head.next.next.next = new Node(10);
     head.next.next.next.prev = head.next.next;

     head.next.next.next.next = new Node(6);
     head.next.next.next.next.prev = head.next.next.next;

     head.next.next.next.next.next = new Node(10);
     head.next.next.next.next.next.prev = head.next.next.next.next;
     
     int key = 10;


     System.out.println("Original List:");
     printLL(head);

     Node ans = delete(head, key);

     System.out.println("List After Deleting Key " + key + ":");
     printLL(ans);

}
}
