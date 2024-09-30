package LinkedList;

public class Reverse {
    int data;
    Reverse next;

    Reverse(Reverse next1, int data1) {
        this.next = next1;
        this.data = data1;
    }

    Reverse(int data1) {
        this.data = data1;
        this.next = null;
    }

    public static Reverse arrToLL(int[] arr) {
        Reverse head = new Reverse(arr[0]);
        Reverse mover = head;
        for (int i = 1; i < arr.length; i++) {
            Reverse temp = new Reverse(arr[i]);
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

    public static void print(Reverse head) {
        Reverse temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Reverse Rec(Reverse head) {
        // Base case should return head if it's the last element
        if (head == null || head.next == null) {
            return head; // fix here
        }

        Reverse newHead = Rec(head.next);
        Reverse front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Reverse head = arrToLL(arr);

        // Testing the recursive reversal
        head = Rec(head);
        print(head);
    }
}
