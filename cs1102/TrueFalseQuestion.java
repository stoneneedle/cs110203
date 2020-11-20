import javax.swing.*;

public class TrueFalseQuestion extends Question {

	// Constructor method for MultipleChoiceQuestion objects
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		
		JPanel buttons = new JPanel();
		
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		
		this.question.add(buttons);
		
		initQuestionDialog();
		
		correctAnswer = answer; // setter for the correct answer
		correctAnswer = correctAnswer.toUpperCase(); // convert to upper case

			
	}
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	
}
