package LinkedList;

public class addLL {

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
			public static Node addition(Node head1 , Node head2) {
				Node t1= head1;
				Node t2 =head2;
				
				int carry = 0;
				Node dummyNode= new Node(-1);
				Node current = dummyNode;
//				current.next= dummyNode;
				while(t1!=null || t2!=null) {
					int sum = carry;
					if(t1 != null)sum = sum + t1.data ;
					if(t2!= null)sum = sum + t2.data;
					
					current.next= new Node(sum%10);
					carry = sum/10;
					
					if(t1!=null)t1=t1.next;
					if(t2!=null)t2=t2.next;
					
					current = current.next;
					;
				}
				if(carry!=0) {
					current.next= new Node(carry);
					current= current.next;
				}
				return dummyNode.next;
			}
		public static void main(String[] args) {
			 Node head1 = new Node(2);
		     head1.next = new Node(9);
		     head1.next.next = new Node(4);
		     head1.next.next.next = new Node(9);

		     Node head2 = new Node(5);
		     head2.next = new Node(2);
		     head2.next.next = new Node(8);
		     
		     printLL(head1);
		     System.out.println();
		     printLL(head2);
		     System.out.println();
		     
		     Node ans= addition(head1,head2);
		     printLL(ans);

		}

	}