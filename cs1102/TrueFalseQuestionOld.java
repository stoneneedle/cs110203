import javax.swing.JOptionPane;

public class TrueFalseQuestionOld extends Question {

	// Constructor method for MultipleChoiceQuestion objects
	public TrueFalseQuestionOld(String question, String answer) {
		// format question string & convert to uppercase
		this.question = "TRUE OR FALSE: " + question;
		this.correctAnswer = answer.toUpperCase();
	}
	
	// Ask a quiz question and allow user to respond with user answer
	String ask () {
		boolean notValid = true; // user has not yet input valid answer
		
		// Question validation loop
		while (notValid) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase(); // allow lowercase input conversion
			
			// check for a valid answer a-e, else display invalid input message
			if (answer.equals("T") || answer.equals("Y") || answer.equals("TRUE") || answer.equals("YES")) {
				return "TRUE";
			}
			else if (answer.equals("FALSE") || answer.equals("NO") || answer.equals("N") || answer.equals("F")) {
				return "FALSE";
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
			}

		}
		return ""; // Return an empty string if end of method is reached (unlikely)
	}
	
}
