package LinkedList;

public class MiddleElem {
	int data;
	MiddleElem next;
	MiddleElem (MiddleElem next1,int data1 ){
		this.next = next1 ;
		this.data = data1 ;
	}
	MiddleElem (int data1){
		this.data = data1 ;
		this.next = null;
	}
	public static MiddleElem arrToLL(int[] arr) {
		MiddleElem head = new MiddleElem(arr[0]) ;
		MiddleElem mover = head;
		for (int i = 1; i < arr.length; i++) {

			MiddleElem temp = new MiddleElem(arr[i]) ;
			mover.next = temp ;
			mover = temp ;
		}
		return head ;
	}

	public static void print(MiddleElem head ) {
		MiddleElem temp = head ;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
    public static MiddleElem Mid (MiddleElem head) {
    	MiddleElem slow = head;
    	MiddleElem fast = head;
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast= fast.next.next;
    	}
    	
    	return slow;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		MiddleElem head = arrToLL(arr);
		head = Mid(head);
		System.out.println(head.data);
//		print(head);
	}
}
