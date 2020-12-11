package lydia.porter.tictactoe;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TicTacToe {
	public Scanner input;
	public String[] board;
	public String turn;
	
	public TicTacToe() {
		//create the input tool
		input = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null; //win, lose, or cat
		popEmptyBoard();
		introText();
		
		while (winner == null) {
			int number = getGoodInt("Enter a slot number to place your mark",9,0); //max, min
			System.out.println(number);
			//this part replaces number slot with x and then o :D
			
			if(board [number-1].equals(String.valueOf(number))) {
				board[number-1] = turn;
				if(turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}
			}
			else {
				System.out.println("Slot already taken; re-enter slot number:");
			}
			printBoard();
			winner = checkWinner();
			
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		}
		else {
			System.out.println("Congratulations!" +winner+ " has won! Thanks for playing.");
		}
		
		//System.out.println(board[0]);

	}
	
	//methods section
	public int getGoodInt(String question, int high, int low) {
		while (true) {
			int numInput; 
			//try catch block:
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput > low && numInput <= high)) {
					System.out.println("Invalid input; re-enter slot number:");
				}
				return numInput;
				
			} catch(InputMismatchException e) { //catch exception that it throws
				System.out.println("Invalid input; re-enter slot number: ");
				input.nextLine(); //nextLine clears string :)
				continue;
			}
			
		}
	}

	public String checkWinner() {
		for (int a = 0; a < 8; a++) {
			//check if one scenario has been matched
			String line = null;
			switch(a) {
			//horizontal checks
			case 0: 
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
				
				// verticals
				
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
				
				//diagonal checks
				
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X"; //x wins
			}
			else if(line.equals("OOO")) {
				return "O "; //o wins
			}
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a==8) {
				return "Draw";
			}
		}
		return null; //no matter what happens it will return who is the winner, draw, or null
		//returns some result every time
	}
	
	public void introText() {
		System.out.println("Welcome to the greatest intellectual challenge of all time: Tic Tac Toe.");
		System.out.println("This is a two player version, so grab your friend and see who is smarter!");
		System.out.println("-------------------------------------------------------------------------");
		printBoard();
		System.out.println("X will play first. Enter a slot number to place your mark.");
		System.out.println();
	}
	

	public static void main(String[] args) {
		new TicTacToe();

	}
	
	public void popEmptyBoard() {
		for (int a = 0; a<9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
	
	public void printBoard() { //Ascii art tic tac toe table! :)
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[0]+" | "+board[1]+" | "+board[2]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[3]+" | "+board[4]+" | "+board[5]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[6]+" | "+board[7]+" | "+board[8]+" | ");
		System.out.println("\t\t\t+-----------+");
	}
	


}
