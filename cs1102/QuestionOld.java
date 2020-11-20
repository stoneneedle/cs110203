import javax.swing.JOptionPane;

public abstract class QuestionOld {
	static int nQuestions = 0; // total number of questions
	static int nCorrect = 0; // number of correct responses

	QuestionDialog question; // instance var for a question
	String correctAnswer; // instance var for the correct answer

	abstract String ask();
	
	// Check the answer to the quiz question
	void check() {
		nQuestions++; // increment number of questions asked
		String answer = ask();
		
		// check if the answer is correct and display correct dialogue, else display incorrect answer dialogue
		if (answer.equals(correctAnswer)) {
			nCorrect++; // Increment number of correct answers
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Your answer is incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	
	// Display final results, i.e. how many the user got correct out of the number of questions asked
	static void showResults() {
		// Display quiz score
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
	


}
