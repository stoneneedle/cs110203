import javax.swing.JOptionPane;

public class QuizPA3 {
	static int nQuestions = 0;
	static int nCorrect = 0;

	// Ask a quiz question
	static String ask (String question) {
		boolean notValid = true; // user has not yet input valid answer
		
		// Question validation loop
		while (notValid) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase(); // allow lowercase input conversion
			
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				return answer;
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid input. Please input a letter from A-E.");
			}

		}
		return ""; // Return an empty string if end of method is reached (unlikely)
	}
	
	// Check the answer to the quiz question
	static void check(String question, String correctAnswer) {
		nQuestions++; // increment number of questions asked
		String answer = ask(question);
		
		if (answer.equals(correctAnswer)) {
			nCorrect++; // Increment number of correct answers
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Your answer is incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	
	// Main method
	public static void main(String[] args) {
		// Create question strings
		String question1 = "How many licks does it take to get to the center of a Tootsie Pop?\n";
		question1 += "A. 1 lick\nB. 2 licks\nC. 17 licks\nD. The world may never know.\nE. 1700 licks";

		String question2 = "Who was the first president of the USA?\n";
		question2 += "A. George Washington\nB. Abraham Lincoln\nC. Andrew Jackson\nD. William Henry Harrison\nE. Ulysses S. Grant";
		
		String question3 = "How many cents make up a dollar?\n";
		question3 += "A. 1\nB. 10\nC. 100\nD. 1,000\nE. 10,000";
		
		String question4 = "Which is considered axiomatic for an existentialist?\n";
		question4 += "A. Ontogeny recapitulates phylogeny.\nB. Cogito ergo sum.\nC. My legs hurt.\nD. Essence precedes existence.\nE. Existence precedes essence.";

		String question5 = "Where is Mount Rushmore?\n";
		question5 += "A. South Dakota.\nB. North Dakota\nC. Wyoming\nD. Texas\nE. New York";
		
		// Ask multiple-choice questions, receive/validate input, & check for the correct answer for each question
		check(question1, "D");
		check(question2, "A");
		check(question3, "C");
		check(question4, "E");
		check(question5, "A");

		// Display quiz score
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
// Thanks for taking my quiz!
}
