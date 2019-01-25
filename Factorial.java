/**
	Class that provides methods to retrieve a factorial number.
*/
public class Factorial {

	/**
		Method that determines whether to use recursive or iterative way of finding factorial.
		@param n the nth factorial to find
		@param type the type to use
		@return the nth factorial
	*/
	public int factorial(int n, String type) {
		if (n < 0) {
			System.err.println("The number cannot be less than 0.");
			return -1;
		}

		if (type.equals("iterative")) {
			return factorial_iterative(n);
		} else if (type.equals("recursive")) {
			return factorial_recursive(n);
		} else {
			System.err.println("Not a valid type. Please enter either \"recursive\" or \"iterative\"");
			return -1;
		}
	}

	/**
		Iterative method for finding factorial.
		@param n the nth factorial to find
		@return the nth factorial
	*/
	public int factorial_iterative(int n) {
		int f = 1;

		for (int i = n; i > 0; i--) {
			f = f * i;
		}

		return f;
	}

	/**
		Recursive method for finding factorial.
		@param n the nth factorial to find
		@return the nth factorial
	*/
	public int factorial_recursive(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * factorial_recursive(n - 1);
	}
}