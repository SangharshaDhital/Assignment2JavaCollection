import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//3. Write a Java program to reverse elements in an array list
public class Question03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> alist = new ArrayList<>();
		System.out.println("Enter the no. of elements you want in an Array List:");
		int n = input.nextInt();
		System.out.println("Great! Enter '" + n + "' Elements of an Array List:");
		for (int i = 0; i < n; i++) {
			String element = input.next();
			alist.add(element);
		}
		System.out.println("Entered Array List: " + alist);
		Collections.reverse(alist);
		System.out.println("Reversed Array List: " + alist);
	}
}
