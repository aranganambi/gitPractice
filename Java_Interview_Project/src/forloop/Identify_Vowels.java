package forloop;

import java.util.HashMap;

public class Identify_Vowels {
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";

        char[] array = str.toCharArray();
        char vowel1 = 'a';
        char vowel2 = 'e';
        char vowel3 = 'i';
        char vowel4 = 'o';
        char vowel5 = 'u';

        HashMap<Character, Integer> map = new HashMap<>();
        map.put(vowel1, 0);
        map.put(vowel2, 0);
        map.put(vowel3, 0);
        map.put(vowel4, 0);
        map.put(vowel5, 0);
        
        for(int i=0; i<array.length; i++) {
        	char current = array[i];
        	
        	if(current==vowel1 || current==vowel2 || current==vowel3 || current==vowel4 || current==vowel5) {
        		map.put(current, map.get(current)+1 );
        	}
        	
        }
        System.out.println(map);
       
}
}
