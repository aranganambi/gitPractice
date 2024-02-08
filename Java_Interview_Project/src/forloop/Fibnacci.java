package forloop;

import java.util.Iterator;

public class Fibnacci {

	public static void main(String[] args) {
		int n1=0, n2=1,n3,i,count=10;
		
		System.out.println(n1); //print 0 and 1
		System.out.println(n2);
		
		for (int i1=2; i1<count;i1++) //loop starts 2 because 0 & 1 already printed
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		}

	}


