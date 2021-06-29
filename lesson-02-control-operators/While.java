public class While {

	public static void main (String[] args) {
		int n = 20;
		long f = 1;

		int i = n;
		while (i > 0) {
			f *= i;
			i--;
		}

		System.out.println("factorial(" + n + ") == " + f);
	}
}
