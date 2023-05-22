import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*12. Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, 
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for 
four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
• I can be placed before V (5) and X (10) to make 4 and 9. 
• X can be placed before L (50) and C (100) to make 40 and 90. 
• C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/



public class Question12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:");
        String roman = input.nextLine().toUpperCase();

        int result = romanToInteger(roman);
        if (result == -1) {
            System.out.println("Invalid Roman numeral");
        } else {
            System.out.println("The integer value of " + roman + " is: " + result);
        }
    }

    public static int romanToInteger(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        int result = 0;
//        int prevValue = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int currValue = map.getOrDefault(s.charAt(i), 0);
//
//            if (currValue == 0) {
//                return -1; // Invalid Roman numeral
//            }
//
//            if (currValue < prevValue) {
//                result -= currValue;
//            } else {
//                result += currValue;
//            }
//            prevValue = currValue;
//        }
//
//        return result;
//    }
//} public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
}
}
