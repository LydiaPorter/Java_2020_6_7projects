package lydia.porter.game;
import java.util.*;
import java.util.List;
import java.awt.*; 
//labels and buttons
//abstract windows tooling kit
import javax.swing.*; 
//create JFrames
//takes all these old awts and gives us more updated ones, what they look like
//Which OS you have affects the overall look and feel of your windows
import java.awt.event.*;
//multi-threading
//multiple programs running in the background
//create functions for buttons

/*
 * Lydia Porter
 * Tic Tac Toe GUI
 * graphical user interface
 * 11/06/2020
 * */

public class TicTacToeGUI extends JPanel{ 
	//inherits all these things from jpanel which allows us to start getting input
	//class level accessible by all methods on class level
	static String[] board; //array holding strings
	static String winner = null;
	//if someone won or if it's a draw
	static String turn; //whose turn?
	//a list of buttons is created, and, when clicked, can change array values in board[].
	
	static int value=0;
	static List<JButton> buttons = new ArrayList<JButton>();
	//list to hold buttons  - list array
	static JFrame frame = new JFrame();
	static JLabel info = new JLabel("Welcome to the ultimate game of Two Player Tic Tac Toe! \n X will play first.\n Click near the center of a slot to place X.");

	
	static void winningText() {
		winner = checkWinner();
		if(winner != null) {
			if (winner.equalsIgnoreCase("draw")) {
				info.setText("It's a draw! \n Thanks for playing.");
				
			}
			else {
				info.setText("Congratulations! \n " +winner+ "has won!");
			}
		}
	}
	
	static String checkWinner() {
		for(int a = 0; a<8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] +board[2];
				break;
			case 1:
				line = board[3] + board[4] +board[5];
				break;
			case 2:
				line = board[6] + board[7] +board[8];
				break;
			case 3:
				line = board[0] + board[3] +board[6];
				break;
			case 4:
				line = board[1] + board[4] +board[7];
				break;
			case 5:
				line = board[2] + board[5] +board[8];
				break;
			case 6:
				line = board[0] + board[4] +board[8];
				break;
			case 7:
				line = board[2] + board[4] +board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X"; 
			}
			else if (line.equals("OOO")) {
				return "O"; 
			}
		}
		for (int i = 0; i<9; i++) {
			if (board[i].equals("Empty")) {
				break; //empty slot, a move could be made, so break this loop.
				//but if none of those are true, we have a draw:
			}
			else if(i==8) {
				return "draw";
			}
		}
		info.setText(turn+"'s turn. Click near the center of a slot to place"+turn+" in.");
		return null;
	}
	
	
	static void populateEmptyBoard() {
		frame.setLayout(null); //manage manually
		info.setBounds(10,160,400,400);
		frame.add(info); //add label to frame and puts it wherever the above location is and ties it to that
		int xIncrease = 0;
		int yIncrease = -100;
		
		for (int i = 0; i <9; i++) {
			board[i] = "empty";
		}
		for (int y = 0; y<3; y++) {
			//3 columns
			xIncrease = 0;
			yIncrease +=100;
			for(int x = 0; x<3; x++) {
				//btn setup
				buttons.add(new JButton(""));
				buttons.get(value).setBounds(xIncrease, yIncrease, 100, 100);
				buttons.get(value).setOpaque(false); //btns are there, but you can't see them
				buttons.get(value).setContentAreaFilled(false);
				buttons.get(value).setBorderPainted(false);
				frame.add(buttons.get(value));
				buttons.get(value).addActionListener(new ActionListener() {
					
				}
			}
		}
	}
	
	
	
	

	//void  doesn't return any data
	public TicTacToeGUI() {
		
	}

	public static void main(String[] args) {
		//winningText();

	}

}
