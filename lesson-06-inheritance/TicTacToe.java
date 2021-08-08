import java.util.Scanner;
import java.util.Random;

class Game {
	
	Board board;
	Player playerX;
	Player playerO;

	Game(Board board, Player playerX, Player playerO) {
		this.board = board;
		this.playerX = playerX;
		this.playerO = playerO;
	}

	void run() {
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
		board.show();
	}

}

class Board {

	char[][] field;

	Board() {
		this.field = new char[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				this.field[row][col] = '.';
			}
		}
	}

	boolean isEmpty(int row, int col) {
		return field[row][col] == '.';
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

abstract class Player {

	Board board;
	char side;

	Player(Board board, char side) {
		this.board = board;
		this.side = side;
	}

	abstract void turn();

}

class HumanPlayer extends Player {

	Scanner in;

	HumanPlayer(Board board, char side) {
		super(board, side);
		this.in = new Scanner(System.in);
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

class ComputerPlayer extends Player {

	Random random;

	ComputerPlayer(Board board, char side) {
		super(board, side);
		this.random = new Random();
	}

	void turn() {
		while (true) {
			int row = random.nextInt(3);
			int col = random.nextInt(3);
			if (board.isEmpty(row, col)) {
				board.set(row, col, side);
				break;
			}
		}
	}

}

class TicTacToe {

	public static void main(String[] args) {
		System.out.println("Choose your side:");
		Scanner in = new Scanner(System.in);
		char side = in.next().charAt(0);

		Board board = new Board();

		Player playerX;
		Player playerO;

		if (side == 'X') {
			playerX = new HumanPlayer(board, 'X');
			playerO = new ComputerPlayer(board, 'O');
		} else {
			playerX = new ComputerPlayer(board, 'X');
			playerO = new HumanPlayer(board, 'O');
		}

		Game game = new Game(board, playerX, playerO);
		game.run();
	}

}

