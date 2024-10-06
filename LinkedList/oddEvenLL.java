package LinkedList;

public class oddEvenLL {

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

    public static Node OE(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = arrToLL(arr);
        head = OE(head);
        print(head);
    }
}
