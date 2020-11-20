
public class DoWhile2 {
	public static void main(String[] args) {
		boolean continueGame = true;
		
		do {
			Rogue.playGame();
			System.out.print("Play again?");
			continueGame = TextIO.getlnBoolean();
		}
		while (continueGame == true);	
	}
	
}
