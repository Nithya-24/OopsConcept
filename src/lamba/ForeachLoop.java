package lamba;

import java.util.*;

public class ForeachLoop {

	 public static void main(String[] args) {  
         
	        List<String> list=new ArrayList<String>();  
	        list.add("Nithya");  
	        list.add("Ram");  
	        list.add("Vasanth");  
	        list.add("VN");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	    }  
	}  