package String;

public class Reverse {
	public static void rev(char[] chr) {
		int n = chr.length;
		int low = 0;
		int high= n-1;
		while(low<=high) {
			char temp = chr[low];
			chr[low]=chr[high];
			chr[high]=temp; 
			low++;
			high--;
		}
	}
public static void main(String[] args) {
	String str ="Priti";
	char[] chr = str.toCharArray();
    rev(chr);
    for (int i = 0; i < chr.length; i++) {
        System.out.print(chr[i]);
	}
}
}
