import java.util.HashSet;

//8. Write a Java program to test if a hash set is empty or not.
public class Question08 {

	public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Lion");
	hset.add("Tiger");
	hset.add("Elephant");
	hset.add("Man");
	if(hset.isEmpty()) {
		System.out.println("Hash Set is empty");
	}
	else {
		System.out.println("Hash Set is not empty it contains following elements:\n"+hset);
	}

	}

}
