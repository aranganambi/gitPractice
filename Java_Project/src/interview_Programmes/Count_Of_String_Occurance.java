package interview_Programmes;

import java.util.HashMap;
import java.util.Iterator;

public class Count_Of_String_Occurance {

	public static void main(String[] args) {
		String str = "Hi this is is aranganambi from chennai";
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Integer count = 1;
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			if (!map.containsKey(split[i])) {
				map.put(split[i], count);
			}
			else {
				map.put(split[i], count+1);
			}
		}
		
		for (String x : map.keySet()) {
			System.out.println("count of word: " +x+ " = "+map.get(x));
		}

	}

}
