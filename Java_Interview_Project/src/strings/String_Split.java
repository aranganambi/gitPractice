package strings;

public class String_Split {

	public static void main(String[] args) {
		String str = "Aranga Nambi Elumalai";
		
		String[] split = str.split(" ");
		
		//Print by using index method
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		System.out.println("**********");
		
		//Print by using for each loop
		for(String s:split) {
			System.out.println(s);
		}
		
		System.out.println("**********");
		
		//Print charecter one by one
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("**********");
		
		//Print the String in reverse order
		char[] charArray2 = str.toCharArray();
		String reversed="";
		for(int i=charArray2.length-1; i>=0; i--) {
			
			reversed=reversed+charArray2[i];
		}
		System.out.println(reversed);
			
	}

}
