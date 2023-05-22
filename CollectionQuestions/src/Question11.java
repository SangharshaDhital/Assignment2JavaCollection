import java.util.InputMismatchException;
import java.util.Scanner;

/*11. Given an integer x, return true if x is a
palindrome
, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/
public class Question11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer!");
		try {
			int n = input.nextInt();
			boolean isPalindrome = isPalindrome(n);
			if (isPalindrome == false) {
				System.out.println(n + " is not Palindrome");
			} else if (isPalindrome = true) {
				System.out.println(n + " is  Palindrome");
			}

		} catch (InputMismatchException e) {
			System.out.println("Please Enter Valid integer Value");
		}
	}

	public static boolean isPalindrome(int n) {
		if (n < 11) {
			return false;
		}
		int rev = 0;
		int original = n;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;

		}
		return original == rev;
	}

}
