package forloop;

public class Print_Even_Number{

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int countOfEvenNum=0;
		int countOfOddNum=0;
		for(int i=1; i<=a.length; i++)
		{
			if(i%2==0)
			{
				countOfEvenNum = countOfEvenNum + 1;
				System.out.println(i+" Is a even number");
			}else {
				countOfOddNum = countOfOddNum + 1;
				System.out.println(i+" Is not a even number");
			}
		}
		System.out.println("-------------------------");
		System.out.println("countOfEvenNum = "+countOfEvenNum);
		System.out.println("countOfOddNum = "+countOfOddNum);
	}

}
