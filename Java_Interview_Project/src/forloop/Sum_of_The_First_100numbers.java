package forloop;

public class Sum_of_The_First_100numbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}

}