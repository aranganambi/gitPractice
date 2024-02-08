package interview_Programmes;

import java.util.HashMap;

public class Count_Of_Repeated_Letters {

	public static void main(String[] args) {
		String str = "Aranganambi";
		
		char[] arr=str.toCharArray();
		
		Integer count = 1;
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], count+1);
			}
		}
		
		for (char x : map.keySet()) {
			System.out.println("Count Of Characters-> "+x+ " = " + map.get(x));
		}

	}

}
