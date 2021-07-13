import java.util.Arrays;

class ArrayExample {
	public static void main (String[] args) {
		int[] nums = { 0, 1, 2, 3 };
		nums[2] = 5;

		System.out.println("nums: " + Arrays.toString(nums));
		System.out.println("nums[1]: " + nums[1]);

		int[] empty = new int[6];

		System.out.println("empty: " + Arrays.toString(empty));

		int[][][] array3d = new int[3][4][5];

		System.out.println("array3d: " + Arrays.toString(array3d));

		int[][] board = new int[3][3];
		board[0][2] = 3;
		board[2][0] = 5;

		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}


		String[] colors = { "red", "green", "blue" };
		System.out.println("colors: " + Arrays.toString(colors));

		char[] arr = new char[] { 'f', 'o', 'o' };
		System.out.println("arr: " + Arrays.toString(arr));

		String str = new String(arr);
		System.out.println("str == " + str);
	}
}
