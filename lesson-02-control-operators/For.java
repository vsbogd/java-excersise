public class For {

	public static void main (String[] args) {
		{
			int n = 5;
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				//fact = fact * i;
				fact = fact * i;
			}
			System.out.println("fact(n) == " + fact);
		}

		{
			long n = 20;
			long evenProduct = 1;
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					continue;
				}
				evenProduct *= i;
			}
			System.out.println("evenProduct(n) == " + evenProduct);
		}
		
	}
}
