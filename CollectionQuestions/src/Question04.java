import java.util.LinkedList;
import java.util.Scanner;

//4. Write a Java program to append the specified element to the end of a linked list.
public class Question04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Apple");
		llist.add("Ball");
		llist.add("Cat");
		System.out.println("Here is the given List:\n" + llist);
		System.out.println("Enter the Element you want to append in the given List:");
		String elemet = input.next();
		llist.add(elemet);
		System.out.println("New List: \n" + llist);
	}

}
