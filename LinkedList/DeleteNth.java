package LinkedList;

import LinkedList.oddEvenLL.Node;

public class DeleteNth {
	static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }
	
	  public static Node arrToLL(int[] arr) {
	        Node head = new Node(arr[0]);
	        Node mover = head;
	        for (int i = 1; i < arr.length; i++) {
	            Node temp = new Node(arr[i]);
	            mover.next = temp;
	            mover = temp;
	        }
	        return head;
	    }
	    public static void print(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }
	    public static Node DeleteNth(Node head, int n) {
	    	
	    	Node fast = head;
	    	for (int i = 0; i < n; i++) {
				fast = fast.next;
			}
	    	Node slow =head;
	    	while(fast.next!=null) {
	    		slow= slow.next;
	    		fast= fast.next;
	    	}
	    	Node delete = slow;
	    	slow.next=slow.next.next;
	    	return head;
	    }
	    public static void main(String[] args) {
	    	
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int n = 2 ;
	        Node head = arrToLL(arr);
	        head = DeleteNth(head,n);
	        print(head);
	        
	    }
}
