package LinkedList;

public class CycleLoop {
	class Node {
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

	public static Node arrToLL(int arr[], int loopPos) {
		Node head = new CycleLoop().new Node(arr[0]);
		Node mover = head;
		Node loopNode = null; // This will store the node where the loop will be created
		
		for (int i = 1; i < arr.length; i++) {
			Node temp = new CycleLoop().new Node(arr[i]);
			mover.next = temp;
			mover = temp;
			if (i == loopPos) {
				loopNode = temp;
			}
		}
		if (loopPos >= 0) {
			mover.next = loopNode;
		}

		return head;
	}

	public static void print(Node head) {
		Node temp = head;
		int count = 0; 
		while (temp != null && count < 15) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			count++;
		}
		System.out.println(temp == null ? "null" : "(cycle detected...)");
	}

	public static boolean loopCheck(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true; // Loop detected
			}
		}
		return false; // No loop
	}

	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 8};

		Node head = arrToLL(arr, 2);

		System.out.println("Is there a loop? " + loopCheck(head));

		print(head);
	}
}
