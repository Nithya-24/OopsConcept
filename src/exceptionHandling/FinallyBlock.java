package exceptionHandling;

public class FinallyBlock {

public static void main(String[] args) {
		    try {
		      // code that generates exception
		      int divideByZero = 5 / 0;
		    }

		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		    
		    //finally block is always execute after try block
		    
		    finally {
		      System.out.println("This is the finally block");
		    }
		  }
		}