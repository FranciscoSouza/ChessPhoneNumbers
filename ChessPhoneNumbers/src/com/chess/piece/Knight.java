package com.chess.piece;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Knight implements ChessPiece {
	// Map with the destination based on the position
    private final Map<Integer, List<Integer>> destinationsForKey;

	public Knight() {
		destinationsForKey = new HashMap <Integer, List<Integer>>();
		
		destinationsForKey.put(0, Arrays.asList(0, 4, 6));
		destinationsForKey.put(1, Arrays.asList(1, 6, 8));
		destinationsForKey.put(2, Arrays.asList(2, 7, 9));
		destinationsForKey.put(3, Arrays.asList(3, 4, 8));
		destinationsForKey.put(4, Arrays.asList(4, 0, 3 ,9));
		destinationsForKey.put(5, Arrays.asList(5));
		destinationsForKey.put(6, Arrays.asList(0, 1, 6 ,7));
		destinationsForKey.put(7, Arrays.asList(7, 6, 2));
		destinationsForKey.put(8, Arrays.asList(8, 1, 3));
		destinationsForKey.put(9, Arrays.asList(9, 4, 2));
	}

	@Override
	public List<Integer> getPossibleDestinations(Integer position) {
		return destinationsForKey.get(position);
	}

}
