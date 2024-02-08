package forloop;

public class How_To_Store_Diff_Datatypes_Values_In_single_Array {

	public static void main(String[] args) {
		// By creating object class type we can overcome this 
		
		Object[] a = {"Aranganambi",27,false,170.1,'E'};

		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
