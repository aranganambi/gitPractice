package java_practice;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
LinkedList<Integer> linkedlist=new LinkedList<Integer>();
linkedlist.add(1);
linkedlist.add(2);
linkedlist.add(3);
linkedlist.add(4);
linkedlist.add(4);
linkedlist.add(5);
linkedlist.add(6);
linkedlist.add(7);
linkedlist.add(8);
System.out.println("linkedlist-"+linkedlist);

//To add an element to the 1st position
linkedlist.addFirst(1);
System.out.println("add element in 1st-"+linkedlist);

//To add an element to the last position
linkedlist.addLast(8);
System.out.println("add element in last-"+linkedlist);

//To get an 1st element 
System.out.println("get the 1st element-"+linkedlist.getFirst());

//To get an last element 
System.out.println("get the last element-"+linkedlist.getLast());

//To get an 1st element using index
System.out.println("get the 1st element using index-"+linkedlist.get(0));

//To get an last element using index
System.out.println("get the last element using index-"+linkedlist.get(9));

//To get an 3rd element using index
System.out.println("get the 3rd element using index-"+linkedlist.get(2));

//Remove 1st and last
System.out.println("to remove the 1st element-"+linkedlist.removeFirst());
System.out.println(linkedlist);

System.out.println("to remove the last element-"+linkedlist.removeLast());
System.out.println(linkedlist);

//to remove 1st element we can use poll method and pollFirst method
System.out.println("to remove the 1st element-"+linkedlist.poll());
System.out.println(linkedlist);

System.out.println("to remove the 1st element-"+linkedlist.pollFirst());
System.out.println(linkedlist);

//to remove 1st element we can use pollLast method
System.out.println("to remove the lastst element-"+linkedlist.pollLast());
System.out.println(linkedlist);

//to remove 1st occurance
linkedlist.removeFirstOccurrence(4);
System.out.println("remove 1st occurance-"+linkedlist);

//to remove last occurance
linkedlist.removeLastOccurrence(4);
System.out.println("remove last occurance-"+linkedlist);

for(int i=0;i<linkedlist.size();i++){
	System.out.println("using for loop:"+ linkedlist.get(i));
}

for(Integer linkedlistref:linkedlist) {
	System.out.println(linkedlistref);

}
		
	}

}
