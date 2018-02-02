package com.chess.piece;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pawn implements ChessPiece {

	private boolean isQueen = false;
	
	// Map for destinations
	private Map<Integer, List<Integer>> currentMapPosition;
	
	// pawn first move
	private final Map<Integer, List<Integer>> firstMovements;

	// pawn moves before it becomes a queen.
	private final Map<Integer, List<Integer>> nextMovements;

	// pawn moves when become a queen
	private final Map<Integer, List<Integer>> destMovements;


	public Pawn() {
		firstMovements = new HashMap<Integer, List<Integer>>();

		firstMovements.put(0, Arrays.asList(0, 8, 5));
		firstMovements.put(1, Arrays.asList(1));
		firstMovements.put(2, Arrays.asList(2));
		firstMovements.put(3, Arrays.asList(3));
		firstMovements.put(4, Arrays.asList(4, 1));
		firstMovements.put(5, Arrays.asList(5, 2));
		firstMovements.put(6, Arrays.asList(6, 3));
		firstMovements.put(7, Arrays.asList(7, 4, 1));
		firstMovements.put(8, Arrays.asList(8, 5, 2));
		firstMovements.put(9, Arrays.asList(9, 6, 3));

		nextMovements = new HashMap<Integer, List<Integer>>();

		nextMovements.put(0, Arrays.asList(0, 8));
		nextMovements.put(1, Arrays.asList(1));
		nextMovements.put(2, Arrays.asList(2));
		nextMovements.put(3, Arrays.asList(3));
		nextMovements.put(4, Arrays.asList(4, 1));
		nextMovements.put(5, Arrays.asList(5, 2));
		nextMovements.put(6, Arrays.asList(6, 3));
		nextMovements.put(7, Arrays.asList(7, 4));
		nextMovements.put(8, Arrays.asList(8, 5));
		nextMovements.put(9, Arrays.asList(9, 6));

		destMovements = new HashMap<Integer, List<Integer>>();
		destMovements.put(0, Arrays.asList(0, 7, 9, 8, 5, 2));
		destMovements.put(1, Arrays.asList(1, 2, 3, 4, 7, 5, 9));
		destMovements.put(2, Arrays.asList(2, 1, 3, 5, 8, 0, 4, 6));
		destMovements.put(3, Arrays.asList(1, 2, 3, 5, 7, 6, 9));
		destMovements.put(4, Arrays.asList(1, 2, 4, 5, 6, 7, 8));
		destMovements.put(5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
		destMovements.put(6, Arrays.asList(4, 5, 6, 2, 8, 9, 3));
		destMovements.put(7, Arrays.asList(7, 4, 1, 8, 9, 5, 3, 0));
		destMovements.put(8, Arrays.asList(2, 5, 8, 0, 7, 9, 4, 6));
		destMovements.put(9, Arrays.asList(7, 8, 9, 6, 3, 0, 5, 1));

		currentMapPosition = firstMovements;
	}

	public List<Integer> getPossibleDestinations(Integer position) {

		return currentMapPosition.get(position);
	}

	public void registerMoveTo(final int move) {

		if (!isQueen) {
			if (movedToTopRow(move)) {
				currentMapPosition = destMovements;
				isQueen = true;
			} else {
				currentMapPosition = nextMovements;
			}
		}
	}

	private boolean movedToTopRow(final int position) {
		return position >= 1 && position <= 3;
	}

}
