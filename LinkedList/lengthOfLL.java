package LinkedList;

public class lengthOfLL {
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

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;

		int loopLength = lengthOfLoop(head);
		if (loopLength > 0) {
			System.out.println("Length of Loop: " + loopLength);
		} else {
			System.out.println("No loop found in the LinkedList.");
		}
	}

	private static int lengthOfLoop(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return findLength(slow);
			}
		}
		return 0; 
	}

	private static int findLength(Node slow) {
		int count = 1;
		Node current = slow.next;

		while (current != slow) {
			count++;
			current = current.next;
		}
		return count;
	}
}
