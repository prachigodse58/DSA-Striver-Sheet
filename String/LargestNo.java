package String;

public class LargestNo {
	public static void Large(char[] chr) {
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] > max) {
				 max= Math.max(max, chr[i]);
			}
		}
		System.out.println(max);
	}
public static void main(String[] args) {
	String str= "4028";
	char[] chr = str.toCharArray();
    Large(chr);	
}
}
