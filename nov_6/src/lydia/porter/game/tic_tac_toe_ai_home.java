package lydia.porter.game;

public class tic_tac_toe_ai_home {

	public tic_tac_toe_ai_home() {
		
		public int comp_move(String[] board, String EMPTY, String TIE) { //pass in string array called board
			String[] test_board = new String [9];
			//make a copy to work with sine the function will be changing array
			for (int i = 0; i <9; i++) {
				test_board[i] = board[i];
			}
			int[] best_moves = {1,2,3,4,5,6,7,8,9};
			int[] legalmoves = legal_moves(board, 9, EMPTY);
			//check/see if computer can win with any of these legal moves
			for (int move: legalmoves) {
				test_board[move] = computer;
				//put comp piece in the board where it's at
				//assigned move to board
				String win = checkWinner(test_board,EMPTY,TIE);
				if (win.equals(computer)) {
					return move; //204
				}
				test_board[move] = EMPTY;
				
				
				
			}
			//returns an x or an o
			
			//if human can win
			for (int move: legalmoves) {
				test_board[move] = human;
				//put comp piece in the board where it's at
				//assigned move to board
				String win = checkWinner(test_board,EMPTY,TIE);
				if (win.equals(human)) {
					//if the human is the winner/could win, it will "return" that move
					//it will place that move
					return move;
				}
				test_board[move] = EMPTY;
				
		}
			
			
			//chose best move
			for (int move: best_moves) {
				//is move in legal moves?
				//if (legalmoves.contains(move)) {
				boolean inarray = contains(legalmoves, move);
				if (inarray) {
					return move;
				}	
			}
			return best_moves[0]; //one of the above 3 scenarios should get hit
			
			
	}
		
		public boolean contains(int[] array, int key) {
			//array[], key
			for(int i: array) {
				if (i == key) {
					return true;
				}
			}
			return false; 
			//this method can get a true or false response to see if it is in there
		}
		
		
		
		/*else move = comp move board empty tie
				System.out.print(move);
				
				(if move!= -1)
*/
	public static void main(String[] args) {
		new tic_tac_toe_ai_home();

	}

}
