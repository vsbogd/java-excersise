public class For {

	public static void main (String[] args) {
		
		int n = 10;
		int x = 2;
		int p = 1;
		//int some_var; // C++ style
		//int someVar; // Java style

		for (int i = 0; i < n; i++) {
			// p = p * x;
			p *= x;
		}

		System.out.println("power(" + x + ", " + n + ") == " + p);
	}
}
