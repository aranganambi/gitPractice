package forloop;

import java.util.HashMap;
import java.util.Map;

public class Check_Duplicate_Value {
	public static void main(String[] args) {
		int[] array = {1,2,2,4,3,4,6,5,7,6,2};
		
		String[] str = {"Chennai","Hi","This","Is","Is","Aranganambi","From","Chennai"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		Integer count = 1;
		for (int i=0; i<str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], count);
			}else {
				map.put(str[i], count+1);
				System.out.println("This is a duplicate value = "+str[i]);
			}
		}
		//System.out.println(map);
		}
		
	}

