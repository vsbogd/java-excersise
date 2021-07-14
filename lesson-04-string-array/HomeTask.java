import java.util.Scanner;
import java.util.Arrays;

class StringProcessor {

	String str;

	StringProcessor(String str) {
		this.str = str;
	}

	boolean isTitleCase(char c) {
		return Character.isTitleCase(c);
	}

	boolean isSpace(char c) {
		return Character.isWhitespace(c);
	}
	
	String getStr() {
		return str;
	}
	
	boolean isSentence() {
		// TODO: return true if str starts from title case letter (use
		// isTitleCase() method) and ends by '.', '!' or '?'.
		return false;
	}

	String getFirstWord() {
		// TODO: return the first word of the str. Use isSpace() method to find
		// if character is a space.
		String word = "";
		return word;
	}

	String getLastWord() {
		// TODO: return the last word of the str. Use isSpace() method to find
		// if character is a space.
		String word = "";
		return word;
	}

	boolean contains(String other) {
		// TODO: return true if str contains the argument. Hint: you can check
		// String.indexOf() method documentation
		return false;
	}

}

class ArrayGenerator {

	int[] getPowers(int x, int count) {
		// TODO: generate and return the array of powers of the x starting from
		// 0. For example getPowers(2, 4) should return [ 1, 2, 4, 8 ]
		int[] powers = {};
		return powers;
	}

}

class ArrayProcessor {

	int[] nums;

	ArrayProcessor(int[] nums) {
		this.nums = nums;
	}

	int[] getNums() {
		return nums;
	}

	int sum() {
		// TODO: return the sum of the elements of the nums array
		return 0;
	}

	boolean[] even() {
		// TODO: retun array of booleans each element contains true if
		// corresponding element of the nums is even and false otherwise.
		boolean[] even = {};
		return even;
	}

}

public class HomeTask {

	
	public static void main (String[] args) {
		StringProcessor strProc = new StringProcessor("Hello world!");
		System.out.println("String: " + strProc.getStr());
		System.out.println("Is sentence: " + strProc.isSentence());
		System.out.println("First word: " + strProc.getFirstWord());
		System.out.println("Last word: " + strProc.getLastWord());
		System.out.println("Contains 'world': " + strProc.contains("world"));

		System.out.println();

		ArrayGenerator arrGen = new ArrayGenerator();
		System.out.println("Powers of 6: " +
				Arrays.toString(arrGen.getPowers(6, 7)));

		ArrayProcessor arrProc = new ArrayProcessor(new int[] { 1, 2, 3, 4 });
		System.out.println("Array: " + Arrays.toString(arrProc.getNums()));
		System.out.println("Sum: " + arrProc.sum());
		System.out.println("Even: " + Arrays.toString(arrProc.even()));
		
	}
}
