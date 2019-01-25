/**
	Class that provides methods to retrieve a fibonacci number.
*/
public class Fibonacci {
	/**
		Method that determines whether to use recursive or iterative way of finding fibonacci number.
		@param n the nth fibonacci number to find
		@param type the type to use
		@return the nth fibonacci number
	*/
	public int fibonacci(int n, String type) {
		if (n < 1) {
			System.err.println("Number cannot be less than 1.");
			return -1;
		}

		if (type.equals("iterative")) {
			return fibonacci_iterative(n);
		} else if (type.equals("recursive")) {
			return fibonacci_recursive(n);
		} else {
			System.err.println("Not a valid type. Please enter either \"recursive\" or \"iterative\"");
			return -1;
		}
	}

	/**
		Iterative method of finding fibonacci number
		@param n the nth fibonacci number to find
		@return the nth fibonacci number
	*/
	public int fibonacci_iterative(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int num1 = 0;
		int num2 = 1;
		int fib = 0;

		for (int i = 0; i < n - 1; i++) {
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
		}

		return fib;
	}

	/**
		Recursive method of finding fibonacci number
		@param n the nth fibonacci number to find
		@return the nth fibonacci number
	*/
	public int fibonacci_recursive(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
	}
}