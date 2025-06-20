package boardgame;

import java.util.Iterator;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // Apenas para enfatizar e ficar didático
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getcolumn()];
	}

	
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j=0; j <mat.length; j++) {
				if (mat[i][j] /* valor boleano */ ) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
}
