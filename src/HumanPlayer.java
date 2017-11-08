import java.util.Scanner;

/**
 * 
 */

/**
 * @author Marcus Perez
 *
 */

public class HumanPlayer extends Player{
	Scanner scan = new Scanner(System.in);
	@Override
	public String generateRoshambo() {
		
		return scan.nextLine();
	}
}
