import java.util.Random;

public class GuessNumber {

	public static void main (String[] args) {
		Random random = new Random();
		// secret is a random number between 1 and 100 inclusive
		// see https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-
		int secret = 1 + random.nextInt(100);
		
		// TODO: Implement the "Guess a number game.
		// Application asks user to enter a number in a loop. Each time a user
		// inputs some number application checks if the number is equal to the
		// secret. If user guesses the secret right then app shows "You won"
		// and exits. If user cannot guess a number in 10 attempts then app
		// shows "You lost" and exits.
	}

}
