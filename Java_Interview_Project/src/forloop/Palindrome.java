package forloop;

public class Palindrome {
	public static void main(String[] args) {
		String str = "level";
		char[] arr = str.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i];
		}
		if (rev.equals(str)) {
			System.out.println("This is the palindrome");
		} else {
			System.out.println("This is not palindrom");
		}
	}
}
