//Description: Java application that is a trivia game for Game of Thrones, that uses a GUI.

package qanda;
import javax.swing.JOptionPane;

public class QuestionAndAnswer{
	/** This method asks the question, trims and uppercases the answer
	 * 
	 * @param question	outputs question string
	 * @return ans		returns answer to question
	 */
	public String setQuestion(String Question){
		String prompt = Question;
		String title =  "GoT Trivia Game";
		String input = (String)JOptionPane.showInputDialog(null, prompt, title, JOptionPane.QUESTION_MESSAGE, null, null, "Your answer?");
		//change string to all upper case and trim spaces
		if(input == null) {
			String end = "Thanks for playing GoT Trivia Game! Goodbye!";
			javax.swing.JOptionPane.showMessageDialog(null, end, title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		String ans = input.toUpperCase().trim();
		return ans;
	}
	/** This method compares answer to responce, and asks to play again
	 * 
	 * @param answer res	strings to compare	
	 */
	public void setAnswer(String Answer, String Res){
		if(Answer.equals(Res)){
			String prompt = "You are Right!";
			String title =  "GoT Trivia Game";
			javax.swing.JOptionPane.showMessageDialog(null, prompt, title, JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			String prompt = "You are Wrong.";
			String title =  "GoT Trivia Game";
			javax.swing.JOptionPane.showMessageDialog(null, prompt, title, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
