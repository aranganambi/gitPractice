package forloop;

public class Check_Vowels {

	public static void main(String[] args) {
		
		String str = "aranganambi elumalai";
		char[] charArray = str.toCharArray();
		
		char vowel1 = 'a';
		char vowel2 = 'e';
		char vowel3 = 'i';
		char vowel4 = 'o';
		char vowel5 = 'u';
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] == vowel1) {
				System.out.println(charArray[i]+" Is The Vowel Letter");
			}
			else if (charArray[i] == vowel2) {
				System.out.println(charArray[i]+" Is The Vowel Letter");
			}
			else if (charArray[i] == vowel3) {
				System.out.println(charArray[i]+" Is The Vowel Letter");
			}
			else if (charArray[i] == vowel4) {
				System.out.println(charArray[i]+" Is The Vowel Letter");
			}
			else if (charArray[i] == vowel5) {
				System.out.println(charArray[i]+" Is The Vowel Letter");
			}
			else {
				//System.out.println(" Is Not The Vowel Letter");
			}
			
		}

	}

}
