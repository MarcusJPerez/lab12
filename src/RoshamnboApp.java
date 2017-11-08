
import java.util.Scanner;

public class RoshamnboApp {

	public static void main(String[] args) {
		Player opponentPlayer = null;
		Player humanPlayer = new HumanPlayer();

		System.out.println("Please enter your name: ");

		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		boolean loop = true;
		System.out.println("Please select an opponent: Rock or Random ");

		String opponent = Validator.getYOrN(scan, "Rock", "Random");
		while (loop == true) {
			

			System.out.println("Select Rock, Paper , or Scissor");

			String choice = humanPlayer.generateRoshambo();

			System.out.println(userName + " picked : " + choice);

			if (opponent.equalsIgnoreCase("Rock")) {
				opponentPlayer = new RockPlayer();
			} else if (opponent.equalsIgnoreCase("Random")) {
				opponentPlayer = new RandomPlayer();
			}
			String opponentValue = opponentPlayer.generateRoshambo();
			System.out.println(opponent+ " picked : " + opponentValue);
			
			Player.getResults(choice, opponentValue);
			
			System.out.println("Play again? (Y/N)");
			String loopid = Validator.getYOrN(scan, "y", "n");
			if (!loopid.equalsIgnoreCase("y")) {
				loop = false;
			}
		}
	}

}
