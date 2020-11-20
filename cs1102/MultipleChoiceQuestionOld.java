import javax.swing.JOptionPane;

public class MultipleChoiceQuestionOld extends Question {
	// Constructor method for MultipleChoiceQuestion objects
	public MultipleChoiceQuestionOld(String query, String a, String b, String c, String d, String e, String answer) {
		question = query + "\n"; // setter for question stem and answer choices
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		
		correctAnswer = answer; // setter for the correct answer
		correctAnswer = correctAnswer.toUpperCase(); // convert to upper case
	}

	// Ask a quiz question and allow user to respond with user answer
	public String ask () {
		boolean notValid = true; // user has not yet input valid answer
		
		// Question validation loop
		while (notValid) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase(); // allow lowercase input conversion
			
			// check for a valid answer a-e, else display invalid input message
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				return answer;
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid input. Please input a letter from A-E.");
			}

		}
		return ""; // Return an empty string if end of method is reached (unlikely)
	}

}

