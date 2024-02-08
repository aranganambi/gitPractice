package java_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		//it allows duplicate
List<String> arraylist=new ArrayList<String>();

//To insert a element we use (.add) method 
arraylist.add("bike");
arraylist.add("car");
arraylist.add("bus");
arraylist.add("scooter");
arraylist.add("train");
arraylist.add("aeroplane");
arraylist.add("aeroplane");//arraylist allows duplicate elements

System.out.println(arraylist);

//To get a index positon of value
System.out.println(arraylist.indexOf("scooter"));

//To get a value of index positon ,To retrive a element we use (.get) method 
System.out.println(arraylist.get(3));

//To print last value of duplicate element
System.out.println(arraylist.lastIndexOf("aeroplane"));

//If console prints -1 =there is no presents of that particular element
System.out.println(arraylist.indexOf("maruti"));

//To copy a list from one arraylist to another arraylist
List<String> arraylist2=new ArrayList<String>();
arraylist2.addAll(arraylist);
System.out.println(arraylist2);
/*
//To clear element we use .clear method
arraylist2.clear();
System.out.println(arraylist2);
arraylist.clear();
System.out.println(arraylist);
*/

//To remove elements using index position
arraylist.remove(6);
System.out.println(arraylist);

//To remove elements using value 
arraylist.remove("car");
System.out.println(arraylist);

//To add null
arraylist.add(null);
System.out.println(arraylist);

//To replace the element value
arraylist.set(2,"rocket");
System.out.println(arraylist);

//To check the array is empty
System.out.println(arraylist.isEmpty());
System.out.println("---------------------------------------------");

//To iterate elements using for each loop
for(String string:arraylist) {
	System.out.println("using for each loop:"+ string);
}	
System.out.println("---------------------------------------------");

//To iterate elements using for loop
 for(int i=0;i<arraylist.size();i++) {
System.out.println("using for loop:"+ arraylist.get(i));
 
 }
 System.out.println("forward traversing---------------------------------------------");

 //Iteration using ListIterator
 ListIterator<String> iteration = arraylist.listIterator();
 while (iteration.hasNext()) {
System.out.println(iteration.next());	
	
	}
 System.out.println("reverse traversing---------------------------------------------");
 //Reverse Iteration using ListIterator
 while (iteration.hasPrevious()) {
System.out.println(iteration.previous());	
 }
 System.out.println("Iterator---------------------------------------------");

 //Iteration using Iterator(we can only use forward iteration
 Iterator<String> iterator=arraylist.iterator();
 while (iterator.hasNext()) {
System.out.println(iterator.next());
 }
 
// System.out.println("concurrentmodifiucation exception---------------------------------------------");
 //concurrentmodifiucation exception-when the list is iterating then we add /remove any elements it will throw exception
// for(String string:arraylist) {
//		System.out.println("using for each loop:"+ string);
//		arraylist.add("van");
//	}

 
 
 
	
}
}





	


