package LinkedList;

public class Add1LL {

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
		 
		 public static int helper(Node head) {
			 Node temp=head;
			 
			 if(temp == null) {
                 return 1;
			 }
			 int carry = helper(temp.next);
			 temp.data= temp.data + carry;
			 if(temp.data < 10)return 0;
			 temp.data=0;
			 return 1;
		 }
		 
		 public static Node fun(Node head) {
			 int carry= helper(head);
			 if(carry == 1) {
				 Node newNode = new Node(1);
				 newNode.next = head;
				 
				 return newNode;
			 }
			 return head;
		 }
	public static void main(String[] args) {
		 Node head = new Node(9);
	     head.next = new Node(9);
	     head.next.next = new Node(9);
	     head.next.next.next = new Node(9);

	     printLL(head);
	     System.out.println();
	     
	    Node ans= fun(head);
	     printLL(ans);

	
	}

}
