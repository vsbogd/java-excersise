import java.util.Scanner;

public class While {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter x:");
		int x = in.nextInt();
		System.out.println("enter n:");
		int n = in.nextInt();

		int pow = 1;
		while (n > 0) {
			pow = pow * x;
			n--;
		}
		System.out.println("x^n == " + pow);
	}
}
