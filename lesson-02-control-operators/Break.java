import java.util.Scanner;

public class Break {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

	loop:
		while (true) {
			System.out.println("Menu:");
			System.out.println("a) cake");
			System.out.println("b) tee");
			System.out.println("c) coffee");
			System.out.println("q) quit");
			char choice = in.nextLine().charAt(0);

			switch (choice) {
				case 'a':
					System.out.println("Your cake");
					break;
				case 'b':
					System.out.println("Your tee");
					break;
				case 'c':
					System.out.println("Your coffee");
					break;
				case 'q':
					System.out.println("Bye, bye");
					break loop;
				default:
					System.out.println("Please read menu again");
			}
		}
	}

}
