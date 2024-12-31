package LinkedList;

public class YLinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data , Node next){
			this.data= data;
			this.next= next;		
			}
		Node(int data){
			this.data= data;
			this.next= null;
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
	 
	 public static Node common(Node head1, Node head2) {
		 Node t1= head1;
		 Node t2= head2;
		 if(t1==null || t2==null)return null;
		 while(t1!=t2) {
			 t1=t1.next;
			 t2=t2.next;
			 
			 if(t1==t2) {
				 return t1;
				 }
			 if(t1.next==null)t1=head2;
			 if(t2.next==null)t2=head1;
		 }
		return t2;
	 }
	 
public static void main(String[] args) {
	 Node head1 = new Node(1);
     head1.next = new Node(2);
     head1.next.next = new Node(4);
     head1.next.next.next = new Node(5);
     head1.next.next.next.next = new Node(6);

     // Create second list: 8 -> 3
     Node head2 = new Node(8);
     head2.next = new Node(3);

     // Create a common part: 10 -> 11 -> 12
     Node common = new Node(10);
     common.next = new Node(11);
     common.next.next = new Node(12);

     // Attach the common part to both lists
     head1.next.next.next.next.next = common; // List 1: 1 -> 2 -> 4 -> 5 -> 6 -> 10 -> 11 -> 12
     head2.next.next = common;                // List 2: 8 -> 3 -> 10 -> 11 -> 12

     // Print both lists
     System.out.println("List 1:");
     printLL(head1);

     System.out.println("\nList 2:");
     printLL(head2);
     
     System.out.println();
     System.out.println("Sorted LL :");
     Node ans = common(head1, head2);
     printLL(ans);

}
}
