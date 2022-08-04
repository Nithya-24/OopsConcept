package map;

import java.util.*;

class MapExample {
 
    public static void main(String args[])
    {
    	// mapping between a key and a value
    	
        // Creating object for Map.
        Map<Integer, String> map
            = new HashMap<Integer, String>();
 
        // Adding Elements using Map.
        map.put(100, "Nithya");
        map.put(101, "Ram");
        map.put(102, "Vasanth");
 
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " "
                               + m.getValue());
        }
    }
}