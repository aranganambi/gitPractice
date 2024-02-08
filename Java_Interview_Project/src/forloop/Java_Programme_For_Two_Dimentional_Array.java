package forloop;

import java.util.Iterator;

public class Java_Programme_For_Two_Dimentional_Array {

	public static void main(String[] args) {
		int[][] a= {{5,2,9}, {4,8,6}};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]+" ");
			}
		}
		

	}

}
