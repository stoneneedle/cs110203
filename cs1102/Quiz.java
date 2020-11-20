/**
 * PA7
 * by James Groth, for CS 1102, with MM Bari. The Quiz.java file
 * depends on MultipleChoiceQuestion.java and Question.java.
 */

public class Quiz {

	// Main method
	public static void main(String[] args) {
		// Multiple choice questions
		Question question1 = new MultipleChoiceQuestion("How many licks does it take to get to the center of a Tootsie Pop?",
				"1 lick", "2 licks", "17 licks", "The world may never know.", "1700 licks", "d");
		
		Question question2 = new MultipleChoiceQuestion("Who was the first president of the USA?",
				"George Washington", "Abraham Lincoln", "Andrew Jackson",
				"William Henry Harrison", "Ulysses S. Grant", "a");
		
		Question question3 = new MultipleChoiceQuestion("How many cents make up a dollar?",
				"1", "10", "100", "1,000", "10,000", "c");
		
		Question question4 = new MultipleChoiceQuestion("Which is considered axiomatic for an existentialist?",
				"Ontogeny recapitulates phylogeny.", "Cogito ergo sum.", "My legs hurt.",
				"Essence precedes existence.", "Existence precedes essence.", "e");
		
		Question question5 = new MultipleChoiceQuestion("Where is Mount Rushmore?",
				"South Dakota", "North Dakota", "Wyoming", "Texas", "New York", "a");
		
		Question question6 = new MultipleChoiceQuestion("What is the airspeed velocity of an unladen swallow?",
				"20 kph", "African or European?", "30 kph", "40 kph", "50 kph", "b");
		
		Question question7 = new MultipleChoiceQuestion("In what year was the album Dark Side of the Moon released?",
				"1973", "1979", "1977", "1987", "1867", "a");
		
		// True-false questions
		Question question8 = new TrueFalseQuestion("Oppenheimer, quoting the Bhagavad Gita, upon inventing "
				+ "the nuclear bomb, remarked 'now I am become death, destroyer of worlds.'", "true");

		Question question9 = new TrueFalseQuestion("The human body is composed of about 2% water.", "false");

		Question question10 = new TrueFalseQuestion("Thomas Jefferson is commonly referred to by historians "
				+ "as an enigma", "true");
		
		Question question11 = new TrueFalseQuestion("Judicial review is the process by which Congress passes "
				+ "laws.", "false");
		
		// Ask user, check correct answer, and display message using instance methods in dot notation
		question1.check(); question2.check(); question3.check(); question4.check(); // MCs (1)
		question5.check(); question6.check(); question7.check(); // MCs (2)
		question8.check(); question9.check(); question10.check();
		question11.check(); // TFs

		// Finally, use a class method to display the results of the quiz for the user
		Question.showResults();
		
	}
// Thanks for taking my quiz!
}
