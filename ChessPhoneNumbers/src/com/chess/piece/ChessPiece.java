package com.chess.piece;

import java.util.List;

public interface ChessPiece {
	/**
	 * List of numbers where the piece can move
     * @param position -  the possible positions from
     * @return list of numbers the piece
	 */
    public List<Integer> getPossibleDestinations(final Integer position);

    /**
     * The move to a given number
     * @param numberTo - number key
     */
    default public void registerMoveTo(final int numberTo) {}

}
