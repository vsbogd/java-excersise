import java.util.Scanner;

class Game {

	void run() {
		Board board = new Board();
		HumanPlayer playerX = new HumanPlayer(board, 'X');
		HumanPlayer playerO = new HumanPlayer(board, 'O');

		while (true) {
			playerX.turn();
			if (board.isEndOfGame()) {
				break;
			}

			playerO.turn();
			if (board.isEndOfGame()) {
				break;
			}
		}

		System.out.println("Result: " + board.getResult());
	}

}

class Board {

	char[][] field;

	Board() {
		this.field = new char[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				this.field[row][col] = ' ';
			}
		}
	}

	boolean isEmpty(int row, int col) {
		return field[row][col] == ' ';
	}

	void set(int row, int col, char side) {
		field[row][col] = side;
	}

	void show() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(field[row][col]);
			}
			System.out.println();
		}
	}

	boolean isEndOfGame() {
		return !getResult().equals("");
	}

	String getResult() {
		String result;

		for (int row = 0; row < 3; ++row) {
			result = getWinner(row, 0, 0, 1);
			if (result != "") {
				return result;
			}
		}
		for (int col = 0; col < 3; ++col) {
			result = getWinner(0, col, 1, 0);
			if (result != "") {
				return result;
			}
		}
		result = getWinner(0, 0, 1, 1);
		if (result != "") {
			return result;
		}
		result = getWinner(0, 2, 1, -1);
		if (result != "") {
			return result;
		}

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (isEmpty(row, col)) {
					return "";
				}
			}
		}

		return "Draw";
	}

	String getWinner(int row, int col, int incRow, int intCol) {
		if (isEmpty(row, col)) {
			return "";
		}
		char side = field[row][col];
		while (row < 3 && col < 3) {
			if (side != field[row][col]) {
				return "";
			}
			row += incRow;
			col += intCol;
		}
		return "" + side + " won";
	}

}

class HumanPlayer {

	Scanner in;
	Board board;
	char side;

	HumanPlayer(Board board, char side) {
		this.in = new Scanner(System.in);
		this.board = board;
		this.side = side;
	}

	void turn() {
		board.show();
		while (true) {
			System.out.println("Make " + side + " turn: <row> <col>");
			int row = in.nextInt();
			int col = in.nextInt();
			if (board.isEmpty(row, col)) {
				board.set(row, col, side);
				break;
			} else {
				System.out.println("Cell is not empty!");
			}
		}
	}

}

class TicTacToe {

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

}

