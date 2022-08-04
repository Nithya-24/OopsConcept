package constructor;

public class Simple {
	
	String name;
	   //Constructor
	   Simple(){
	      this.name = "Hello World";
	   }
	   public static void main(String[] args) {
	      Simple obj = new Simple();
	      System.out.println(obj.name);
	   }
	}