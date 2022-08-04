package list;
import java.util.*;

public class ListExample {

	 public static void main(String args[])
	    {
	 
	        // Creating a List
	        List<String> al = new ArrayList<>();
	 
	        // Adding elements in the List
	        al.add("mango");
	        al.add("orange");
	        al.add("Grapes");
	 
	        // Iterating the List
	        // element using for-each loop
	        for (String fruit : al)
	            System.out.println(fruit);
	    }
	}
