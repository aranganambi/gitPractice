package forloop;

public class Check_Number_Divisible_By {

	public static void main(String[] args) {
		int[] num = {9,0,8,0,0,6,8,1,3,7};
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] % 2 == 0) {
				System.out.println(num[i]+" = Is divisible by 2");
			}
			else {
				System.out.println(num[i]+" = Is not divisible by 2");
			}
		}

	}

}
