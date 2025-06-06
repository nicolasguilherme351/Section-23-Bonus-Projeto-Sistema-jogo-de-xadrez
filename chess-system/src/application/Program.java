package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		System.out.println(chessMatch.getPiece(0, 0));
		UI.printBoard(chessMatch.getPieces());
		
	}
	
}
