/**
 * 
 */

/**
 * @author Marcus Perez
 *
 */
public abstract class Player {
	private String name;
	private String roshambo;
	private static int wins;
	private static int losses;
	private static int ties;

	public abstract String generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}

	public static String getResults(String user, String ai) {
		
		if (user.equalsIgnoreCase("rock") && ai.equalsIgnoreCase("rock")) {
			ties++;
			System.out.println("Tie");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("rock") && ai.equalsIgnoreCase("paper"))) {
			losses++;
			System.out.println("Loser");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("rock") && ai.equalsIgnoreCase("scissor"))) {
			wins++;
			System.out.println("Winner");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("paper") && ai.equalsIgnoreCase("rock"))) {
			wins++;
			System.out.println("Winner");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("paper") && ai.equalsIgnoreCase("paper"))) {
			ties++;
			System.out.println("Tie");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("paper") && ai.equalsIgnoreCase("scissor"))) {
			losses++;
			System.out.println("Loser");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("scissor") && ai.equalsIgnoreCase("rock"))) {
			losses++;
			System.out.println("Loser");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("scissor") && ai.equalsIgnoreCase("paper"))) {
			wins++;
			System.out.println("Winner");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);

		} else if ((user.equalsIgnoreCase("scissor") && ai.equalsIgnoreCase("scissor"))) {
			ties++;
			System.out.println("Tie");
			System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);
		}
		return "";
	}
}
