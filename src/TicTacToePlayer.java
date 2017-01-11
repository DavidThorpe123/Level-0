
public class TicTacToePlayer {

	public int getMove(TicTacToe ttt) {
		int move = getRule1Move(ttt);
		if (move != 0) {
			return move;
		}
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			if (ttt.canMove(i)) {
				return i;
			}
		}

		return 0;
	}

	int getRule1Move(TicTacToe ttt) {
		if (ttt.get(1) == ttt.get(2) && ttt.get(1) != TicTacToe.OPEN && ttt.get(3) == TicTacToe.OPEN) {
			return 3;
		}
		if (ttt.get(4) == ttt.get(5) && ttt.get(6) == TicTacToe.OPEN) {

		}
		if (ttt.get(7) == ttt.get(8) && ttt.get(9) != TicTacToe.OPEN) {

		}
		if (ttt.get(1) == ttt.get(4) && ttt.get(1) != TicTacToe.OPEN && ttt.get(7) == TicTacToe.OPEN) {
			return 7;
		}
		if (ttt.get(2) == ttt.get(5) && ttt.get(8) != TicTacToe.OPEN) {

		}
		if (ttt.get(3) == ttt.get(6) && ttt.get(9) != TicTacToe.OPEN) {

		}
		if (ttt.get(1) == ttt.get(5) && ttt.get(9) != TicTacToe.OPEN) {

		}
		if (ttt.get(3) == ttt.get(5) && ttt.get(7) != TicTacToe.OPEN) {

		}

		return 0;
	}
}
