package DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
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

	public static Node tailNode(Node head) {
		Node tail = head;
		while(tail.next!=null){
			tail= tail.next;}	
		return tail;
	}

	public static void printLL(Node head) {
		Node temp = head;

		while(temp!=null) {
			System.out.print(temp.data +" ");

			temp= temp.next;
		}
		System.out.println();
	}

	public static List<List<Integer>> findPair(Node head , int sum) {
		List<List<Integer>> result = new ArrayList<>();

		Node left = head;
		Node right = tailNode(head);

		while(left!=null && right!=null && left!=right && left.prev!= right ) {

			if(left.data+right.data == sum) {
				List<Integer> pair = new ArrayList<>();
				pair.add(left.data);
				pair.add(right.data);
				result.add(pair);

				left=left.next;
				right=right.prev;
			}else if(left.data+right.data <sum) {
				left= left.next;
			}
			else {
				right=right.prev;
			}
		}
		return result;

	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.prev = head;

		head.next.next = new Node(3);
		head.next.next.prev = head.next;

		head.next.next.next = new Node(4);
		head.next.next.next.prev = head.next.next;

		head.next.next.next.next = new Node(9);
		head.next.next.next.next.prev = head.next.next.next;

		int sum = 5;

		System.out.println("Original List:");
		printLL(head);

		System.out.println("Pair :");
		List<List<Integer>> ans = findPair(head, sum);
		for(List<Integer> pair : ans) {
			System.out.println(pair.get(0)+","+pair.get(1));
		}

	}
}
