import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*9. Write a Java program to count the number of key-value (size) 
mappings in a map.*/
 
public class Question09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<>();
		System.out.println("Enter the no. of Elements you want to put in the Map:");
		int n=input.nextInt();
		System.out.println("Great ! enter '"+n+"'Elements:");
		for(int i=0;i<n;i++) {
			map.put(input.next(), i+1);
		}
		System.out.println("Map:"+ map);
		System.out.println("no. of Keys-Values in the map:"+map.size());

	}

}
