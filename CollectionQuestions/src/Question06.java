import java.util.LinkedList;
import java.util.Scanner;

//6. Write a Java program that swaps two elements in a linked list.
public class Question06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> llist = new LinkedList<>();
		System.out.println("Enter the no. of elements you want to put in Linked List:");
		int n = input.nextInt();
		System.out.println("Great ! Enter '" + n + "' elements of Linked List:");
		for (int i = 0; i < n; i++) {
			String element = input.next();
			llist.add(element);
		}
		System.out.println("Given Linked List is:\n" + llist);
		System.out.println("Enter the position of two elements you want to swap:");
		System.out.println("Position 1: ");
		int index1 = input.nextInt() - 1;
		System.out.println("Position 2: ");
		int index2 = input.nextInt() - 1;
		boolean isSwapped = swapElements(llist, index1, index2);
		if (isSwapped) {
			System.out.println("Elements have been swapped! \nNew Linked List:\n" + llist);
		} else {
			System.out.println("Please choose valid position !!!");
		}
	}

	public static boolean swapElements(LinkedList<String> llist, int index1, int index2) {
		if (index1 < 0 || index1 >= llist.size() || index2 < 0 || index2 > llist.size()) {
			return false;
		}
		String temp = llist.get(index1);
		llist.set(index1, llist.get(index2));
		llist.set(index2, temp);
		return true;
	}

}
