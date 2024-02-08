package forloop;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		
		String[] arr2 = {"a","b","c","d","e"};
		System.out.println(arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
