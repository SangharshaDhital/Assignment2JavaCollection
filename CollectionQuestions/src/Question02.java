import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2. Write a Java program to sort a given array list.
public class Question02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> aList = new ArrayList<>();
		System.out.println("Enter the no. of Elements you want to put in an Array List:");
		int n = input.nextInt();
		System.out.println("Great! enter '"+n+"' Elements of an Array List");
		for (int i = 0; i < n; i++) {
			String element = input.next();
			aList.add(element);
		}
		System.out.println("\nGiven Array List is: \n" + aList);
		Collections.sort(aList);

		System.out.println("\nYour desired Array List after sorting is:\n" + aList);

	}
}
