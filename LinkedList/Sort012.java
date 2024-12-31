package LinkedList;

public class Sort012 {
		static class Node{
			int data;
			Node next;
			Node(Node next, int data){
				this.next= next;
				this.data= data;
			}
			
			Node(int data){
				this.data= data;
				this.next = null;
			}
		}
	    
		static void printLinkedList(Node head) {
		    Node temp = head;
		    while (temp != null) {
		        // Print the data of the current node
		        System.out.print(temp.data + " "); 
		        // Move to the next node
		        temp = temp.next; 
		    }
		    System.out.println();
		}
		
		
		public static Node sort(Node head) {
			if(head== null || head.next==null) {
				return head;
			}
			
	    	Node zeroHead = new Node(0);
	    	Node oneHead = new Node(0);
	    	Node twoHead = new Node(0);
	    	Node zeroTail = zeroHead, oneTail= oneHead , twoTail= twoHead;
	    	
	    	Node temp = head;
	    	while(temp!=null) {
	    		if(temp.data==0) {
	    			zeroTail.next=temp;
	    			zeroTail=zeroTail.next;
	    		}else if(temp.data==1) {
	    			oneTail.next=temp;
	    			oneTail=oneTail.next;
	    		}else {
	    			twoTail.next= temp;
	    			twoTail=twoTail.next;
	    		}
	    		temp=temp.next;
	    	}
	    	
	    	zeroTail.next = (oneHead.next!=null)? oneHead.next:twoHead.next;
	    	oneTail.next=twoHead.next;
	    	twoTail.next=null;
	    	
	    	head = zeroHead.next;
	    	return head;
	    }
	    

		
//	    1,0,1,2,0,2,1
		public static void main(String[] args) {
			    Node head = new Node(1);
			    head.next = new Node(0);
			    head.next.next = new Node(1);
			    head.next.next.next = new Node(2);
			    head.next.next.next.next = new Node(0);
			    head.next.next.next.next.next = new Node(2);
			    head.next.next.next.next.next.next = new Node(1);

			System.out.println("Original LInkedList");
		    printLinkedList(head);
			
		    Node ans = sort(head);
		    System.out.println("Sorted LInkedList");
		    printLinkedList(ans);
		}
	}





