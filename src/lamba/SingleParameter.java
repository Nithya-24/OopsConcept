package lamba;

	interface Say{  
	    public String say(String name);  
	}  
	  
	public class SingleParameter { 
	    public static void main(String[] args) {  
	      
	        // Lambda expression with single parameter.  
	    	Say s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Nithya"));  
	          
	        // You can omit function parentheses    
	        Say s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("World"));  
	    }  
	}  