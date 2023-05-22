import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringJoiner;
//stringjoiner
//5. Write a Java program to iterate a linked list in reverse order.
public class Question05 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
StringJoiner joinner =new StringJoiner(", ");
LinkedList<String> llist=new LinkedList<>();
System.out.println("Enter the no. of elements you want to put in Linked List: ");
int n=input.nextInt();
System.out.println("Great! enter '"+n+"' elements:");
for(int i=0;i<n;i++) {
	String element=input.next();
	llist.add(element);
}
System.out.println("Your Linked List is: \n"+llist);
System.out.println("Reversed order Linked List is:\n");
ListIterator<String> iterator = llist.listIterator(n);
System.out.print("[");
while(iterator.hasPrevious()) {
	String element=iterator.previous();
	joinner.add(element);
}
System.out.print(joinner.toString());
System.out.print("]");
	}

}
