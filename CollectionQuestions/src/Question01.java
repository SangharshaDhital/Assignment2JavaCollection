import java.util.ArrayList;
import java.util.Scanner;

//1. Write a Java program to remove the third element from an array list
public class Question01 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("!!! This program removes Third Element of an Array List !!!");
		System.out.println("Enter the no. of elements you want to put in an Array List: ");
		int n = input.nextInt();
		if(n < 3) {
			System.out.println("Warning!!! There will be no third element in an Array List to remove Try Again!!!");
			
		}
		System.out.println("Great ! Enter " + n + " elements of an Array List: ");
		for (int i = 0; i < n; i++) {
			String element = input.next();
			arrayList.add(element);
		}
		System.out.println("Your Desired Array List is: " + arrayList);

		System.out.println(
				"The new Array List after removing third element '" + arrayList.remove(2) + "' is: " + arrayList);

	}
}
