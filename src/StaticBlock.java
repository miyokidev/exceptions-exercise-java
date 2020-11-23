// ExceptionInInitializerError: when an initialization static blocks throws an exception and does not process it
public class StaticBlock {
	private static int state;
	
	// Static Block: If you need to do the computation in order to initialize your static variables, you can declare a static
	// block that gets executed once, when the class is first loaded.
	static {
		state = 42 / 0;
	}
}
