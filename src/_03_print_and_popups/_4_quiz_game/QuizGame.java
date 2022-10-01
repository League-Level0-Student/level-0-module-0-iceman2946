package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score;
		score=0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input1=JOptionPane.showInputDialog("What contributed to the fall of the Roman Empire?");	
				// 3.  Use an if statement to check if their answer is correct
				if (input1.equals("A lack of a central goverment")) {
					score+=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String input2=JOptionPane.showInputDialog("After the Roman Empire fell, was Europe unified?");
		if (input2.equals("no")) {
			score+=1;
			}
		String input3=JOptionPane.showInputDialog("Fill in the blank: The ______ age lasted for 400 years.");
		if (input3.equals("Vikings")) {
			score+=2;
		}
		String input4=JOptionPane.showInputDialog("Who had the second most power in the feudal ladder?");
		if(input4.equals("Lords and Ladies")) {
			score+=3;
		}
		JOptionPane.showMessageDialog(null, "Your score is" +score );
		// After all the questions have been asked, tell the user their final score 
		
	}
}
