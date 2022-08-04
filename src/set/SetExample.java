package set;
import java.util.*;

public class SetExample {

  public static void main(String[] args)
	    {
	        // Set demonstration using HashSet & extends the collection interface
	        Set<String> Set = new HashSet<String>();
	         
	        // Adding Elements 
	        Set.add("one");
	        Set.add("two");
	        Set.add("three");
	        Set.add("four");
	        Set.add("five");
	        Set.add("five");  //ignore the duplicate entry in set
	        
	        // Set follows unordered way.
	        System.out.println(Set);
	    }
	}
