import java.util.ArrayList;
import java.util.LinkedList;

//7. Write a Java program to convert a linked list to an array list.
public class Question07 {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Nepal");
		llist.add("Kathmandu");
		llist.add("Dang");
		llist.add("Mount Everest");
		
		ArrayList<String> alist=new ArrayList<>(llist);
		System.out.println("Linked List: "+llist);
		System.out.println("Array List :"+alist);

	}

}
