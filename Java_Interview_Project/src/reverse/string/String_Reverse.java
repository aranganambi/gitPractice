package reverse.string;

import java.util.Iterator;

public class String_Reverse {

	public static void main(String[] args) {
		String str = "vinoth";
		
		char[] array=str.toCharArray();
		String reversed = " ";
		for(int i=array.length-1; i>=0; i--)
		{
			reversed=reversed+array[i];
		}
		System.out.println(reversed);
	}

}
