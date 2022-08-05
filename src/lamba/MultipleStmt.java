package lamba;

	interface MultiStmt{  
	    String say(String message);  
	}  
	  
public class MultipleStmt {
	    public static void main(String[] args) {  
	      
	        // You can pass multiple statements in lambda expression  
	    	MultiStmt person = (message)-> {  
	            String str1 = "Hello World, ";  
	            String str2 = str1 + message;   
	            return str2;  
	        };  
	            System.out.println(person.say("from bridgelabz."));  
	    }  
	}  