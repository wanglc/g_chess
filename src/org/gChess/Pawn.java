package org.gChess;

import java.util.ArrayList;

//Pawn moves 1 space forward. During Pawn's first move it my instead move two if both spaces are open
//Pawn attacks to the forward diagonals one square ahead.
//When Pawn reaches farthest row it is promoted to any other piece the player selects besides king
//If a pawn is on the fifth row and an opponents pawn uses its two space move ending up directly adjacent to it, in the immediate following turn the pawn may attack as normal ending up behind the pawn as if the pawn had only moved one. this results in the capture of the pawn. This move is called En passant.

public class Pawn extends ChessPiece {

	public Pawn(int color, ChessBoard cb) {
		super(color,cb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}