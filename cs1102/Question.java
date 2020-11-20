import java.awt.*;
import javax.swing.*;

public class Question {

	static int nQuestions = 0; // total number of questions
	static int nCorrect = 0; // number of correct responses

	QuestionDialog question; // instance var for a question
	String correctAnswer; // instance var for the correct answer

	Question(String question) {
		// Create GUI panel interface with true/false buttons
		this.question = new QuestionDialog();
		
		this.question.setLayout(new GridLayout(0, 1));
		this.question.add(new JLabel("     " + question + "     ", JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	String ask () {
		question.setVisible(true);
		return question.answer;
	}
	
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
