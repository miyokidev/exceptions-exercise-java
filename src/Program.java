public class Program {

	public static void main(String[] args) {
		
		
		//-------------------------------------------------------
		// RUNTIME EXCEPTIONS
		//-------------------------------------------------------
		
		// ArithmeticException: when attempting to divide by 0
		try {
			int test = 2/0;
		} catch (ArithmeticException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}

		// ArrayIndexOutOfBoundsException: when trying to access an index of an array that is not 
		// in the range 0 array size - 1
		try {
			int[] test = {1,0,1};
			System.out.println(test[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}
		
		// ClassCastException: when trying to cast an object in a class whose object is not an instance
		try {
			Object i = Integer.valueOf(42);
			String s = (String)i;
		} catch (ClassCastException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}
		
		// IllegalArgumentException: tells the caller that a parameter is not correct
		try {
			giveMe8To10(11); // The method wants a number between 8 to 10
		} catch (IllegalArgumentException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}
		
		// NullPointerException: when trying to use an object that is null
		try {
			Object a = null;
			a.toString(); // this will throw a NullPointerException
		} catch (NullPointerException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}
		
		// NumberFormatException: when trying to parse a number from a string that is not a number
		try {
			int test = Integer.parseInt("ABC");
		} catch (NumberFormatException e) {
			displayException(e);
		} catch (Exception e) {
			System.out.println("This message wont be displayed");
		} finally {
			displayFinally();
		}
		
		//-----------------------------------------------------------------------------------------------------
		// The following comments are for ERRORS if you want to test one make sure that the other ones are commented or it
		// will only stop to the first one.
		//-------------------------------------------------------------------------------------------------------
		
		// ExceptionInInitializerError: when an initialization static blocks throws an exception and does not process it
		// Uncomment below to test
		//new StaticBlock();
		
		// StackOverflowError: when a method calls itself and there is no stop condition => infinite loop
		// Uncomment below to test
		//recursiveException();
		
		// NoClassDefFoundError: when a piece of code uses a class that is not available at runtime (for example, .class file
		// deleted or missing library)
		// No test setted up for this one but I think It's clear.
	}
	
	// Method to display the type of the exception and its message.
	public static void displayException(Exception e) {
		System.out.println("-------------------------------------");
		System.out.print("The exception is: ");
		System.out.println(e.getClass());
		System.out.print("Message: ");
		System.out.println(e.getMessage());
	}
	
	// Method that will always be called by the finally block no matter if there's an exception or not.
	public static void displayFinally() {
		System.out.println("finally is always shown");
		System.out.println("-------------------------------------");
		System.out.println();
	}
	
	// Method where we want to receive a number between 8 to 10
	public static void giveMe8To10(int i) {
		if (i < 8 || i > 10) {
			throw new IllegalArgumentException("Give me a number between 8 to 10 pls");
		}
	}
	
	public static void recursiveException() {
		recursiveException();
	}
	
	
}
