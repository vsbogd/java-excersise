public class DataType {

	public static strictfp void main(String[] args) {
		{
			int a = 3;
			int b = 7;
			int c;

			System.out.println("b / a == " + (b / a));
			
			// Runtime error
			//System.out.println("3 / 0 == " + (3 / 0));
			
			c = a + b;
			System.out.println("c == " + c);

			int _переменная01 = 34;

			System.out.println("_переменная01 == " + _переменная01);
		}

		// Compilation error
		//System.out.println("a == " + a);

		{
			double a = 3.0;
			double b = 7.0;

			System.out.println("b / a == " + (b / a));
		}

		{
			boolean b = 3 == 7;
			System.out.println("b == " + b);
		}

		{
			char c = '\u0039';

			System.out.println("c == " + c);
		}

		{
			byte a = 1;
			byte b = 2;
			byte c;

			// Compilation error
			//c = (a + b);
			c = (byte) (a + b);
			System.out.println("c == " + c);
		}

		{
			int a = 1234;
			double d = a;
			System.out.println("d == " + d);

			int c = (int) d;
			System.out.println("c == " + c);
		}

		{
			double a = 256.0;
			double root = Math.sqrt(a);

			System.out.println("root == " + root);
		}

		{
			System.out.println("3.0 / 0.0 == " + (3.0 / 0.0));
			System.out.println("-3.0 / 0.0 == " + (-3.0 / 0.0));
			double positiveInf = (3.0 / 0.0);
			double negativeInf = (-3.0 / 0.0);
			System.out.println("positiveInf / negativeInf == " + (positiveInf / negativeInf));
		}

		{
			char c = 'B';
			int n = (int) c;
			System.out.println("n = " + n);
			int nn = c;
			System.out.println("nn = " + nn);
		}


	}

}

