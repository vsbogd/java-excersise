import java.util.Scanner;

public class Switch {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Choose a dish:");
		System.out.println("1) a cake");
		System.out.println("2) a cup of tea");

		int choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("a cake");
			break;
		case 2:
			System.out.println("a cup of tea");
			break;
		default:
			System.out.println("Please choose an item from the menu");
			break;
		}
		
	}
}
