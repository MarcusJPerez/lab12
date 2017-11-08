import java.util.Random;

/**
 * 
 */

/**
 * @author Marcus Perez
 *
 */
public class RandomPlayer extends Player {

	/*
	 * @see Player#generateRoshanbo()
	 */
	@Override
	public String generateRoshambo() {
		String roshambo = "";
		Random random = new Random();
		int roshValue = random.nextInt(3);
		switch (roshValue) {
		case 0:
			roshambo = "Rock";
			break;
		case 1:
			roshambo = "Paper";
			break;
		case 2:
			roshambo = "Scissor";
			break;
			default: ;
		}
		return roshambo;
	}
}
