package org.gChess;

import java.util.ArrayList;

//King may move one sqaure in any direction provided it cannot be attack by an opponent in that square.
//if a king is under attack it is in check. The player must protect his king by moving it out of harms way or moving another pice to block or capture the attacker.
//If the king is under attack and cannot escape through any of the aforementioned means then this is checkmate and the game is over with the attacking player being
//decalred the winner
//The king may castle if neither the king or rook has been moved and no pieces remain in the squares to block their progress. On the kings side rook this is down by moving
//the king two squares towards the rook and the rook two squares towards the king.  The result should be the two pieces next two each other on the opposite side of each other
// where they started.  the same goes for a queen side castle but the king moves three spaces instead


public class King extends ChessPiece {

	public King(int color, ChessBoard cb) {
		super(color, cb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}