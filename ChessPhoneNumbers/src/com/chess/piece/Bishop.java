package com.chess.piece;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bishop implements ChessPiece {
	// Map with the destination based on the position
    private final Map<Integer, List<Integer>> destinationsForKey;

	public Bishop() {
		destinationsForKey = new HashMap <Integer, List<Integer>>();
		destinationsForKey.put(0, Arrays.asList(0, 7, 9));
		destinationsForKey.put(1, Arrays.asList(1, 5, 9));
		destinationsForKey.put(2, Arrays.asList(2, 4, 6));
		destinationsForKey.put(3, Arrays.asList(3, 5, 7));
		destinationsForKey.put(4, Arrays.asList(2, 4, 8));
		destinationsForKey.put(5, Arrays.asList(5, 1, 7, 3, 9));
		destinationsForKey.put(6, Arrays.asList(6, 2, 8));
		destinationsForKey.put(7, Arrays.asList(7, 5, 3, 0));
		destinationsForKey.put(8, Arrays.asList(8, 4, 6));
		destinationsForKey.put(9, Arrays.asList(9, 0, 5, 1));
	}

	@Override
	public List<Integer> getPossibleDestinations(Integer position) {
		return destinationsForKey.get(position);
	}

}
