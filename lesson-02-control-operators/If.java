import java.util.Scanner;

public class If {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter a:");
		int a = in.nextInt();
		System.out.println("enter b:");
		int b = in.nextInt();

		if (a < b) {
			System.out.println("max(a, b) == " + b);
		} else {
			System.out.println("max(a, b) == " + a);
		}
	}

}
