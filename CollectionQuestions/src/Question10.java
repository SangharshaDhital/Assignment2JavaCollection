import java.util.Scanner;

/*10. Given an array of integers nums and an integer target, return indices 
of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/
public class Question10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of integers you want to put in an Array:");
		int n = input.nextInt();

		System.out.println("Enter '" + n + "' elements of an array:");
		int[] nums = new int[n];
		for (int k = 0; k < n; k++) {
			nums[k] = input.nextInt();
		}
		System.out.print("The given Array is: \n[");
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i]);
			if (i != n - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println("\nEnter the target integer:");
		int target = input.nextInt();
		int[] index = new int[2];
		boolean found = false;

		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i;
					index[1] = j;
					found = true;
					int a = nums[i];
					int b = nums[j];
					passLocalValue(a, b);

				}

			}
		}

		if (found) {

			System.out
					.println("\nTarget is '" + target + "' One of them is at '[" + index[0] + ", " + index[1] + "]' ");
		} else {
			System.out.println("There is no any number in the Array to form target " + target);

		}
	}

	public static void passLocalValue(int a, int b) {
		System.out.println("'"+a + " + " + b + "' forms the target ");

	}

}
