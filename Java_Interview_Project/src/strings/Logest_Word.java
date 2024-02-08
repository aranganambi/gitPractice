package strings;

public class Logest_Word {

	public static void main(String[] args) {
		String[] words= {"My","Name","Is","Aranganambi","Ezhumalai"};
		
			  String longestWord = words[0];
			  for (int i = 1; i < words.length; i++) {
			    if (words[i].length() > longestWord.length()) {
			      longestWord = words[i];
			    }
			  }
			  System.out.println(longestWord);
			}
		

	}


