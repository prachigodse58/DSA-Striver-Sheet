package LinkedList;

import LinkedList.lengthOfLL.Node;

public class Palindrome {
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
		
		 public static Reverse rev(Reverse head) {
		        Reverse temp = head;
		        Reverse prev = null;
		        while (temp != null) {
		            Reverse front = temp.next;
		            temp.next = prev;
		            prev = temp;
		            temp = front;
		        }
		        return prev;
		    }

		

		 public static Node rev(Node head) {
			 Node temp = head;
			 Node prev = null;
		        while (temp != null) {
		        	Node front = temp.next;
		            temp.next = prev;  
		            prev = temp;
		            temp = front;
		        }
		        return prev;
		    }
		  public static boolean isPalindrome(Node head) {
			  
			  if(head == null &&  head.next== null) return true;
			  Node slow = head;
			  Node fast = head;
			  while(fast.next != null && fast.next.next!=null) {
				  slow = slow.next;
				  fast = fast.next.next;
				  
			  }
			  Node newHead =  rev(slow.next);
			  
			  Node first = head;
			  Node second = newHead ;
			  while(second != null) {
				  if(first.data != second.data) {
					  rev(newHead);
					  return false;
				  }
				  first = first.next;
				  second= second.next;
				
			  }
			 rev(newHead);
			return true;
			  
		  }
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 2,1};
	        Node head = arrToLL(arr);
            boolean a=isPalindrome(head);System.out.println(a);
		}
		
		
	}
	
	
	
}
