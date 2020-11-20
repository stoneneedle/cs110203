import javax.swing.JOptionPane;

public class QuizOld {
	public static void main(String[] args) {
		boolean notCorrect = true; // user has not yet input correct answer
		// Create multiple-choice question stem string
		String question = "How many licks does it take to get to the center of a Tootsie Pop?\n";
		
		// Append multiple-choice answers
		question += "A. 1 lick\n";
		question += "B. 2 licks\n";
		question += "C. 17 licks\n";
		question += "D. The world may never know.\n";
		question += "E. 1700 licks";
		
		// Continue showing the question/input screen until correct answer is put in
		while (notCorrect) {
			// Receive user input
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();

			// Based upon user's input, display a dialogue box indicating correct, incorrect
			// or invalid input
			if (answer.equals("D")) {
				JOptionPane.showMessageDialog(null,"Correct!");
				break;
			}
			else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("E")) {
				JOptionPane.showMessageDialog(null,"Your answer is incorrect. Please try again!");
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid input. Please input a letter from A-E.");
			}
		}
	}
}
