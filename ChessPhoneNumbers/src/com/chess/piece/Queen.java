package com.chess.piece;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Queen implements ChessPiece {
	// Map with the destination based on the position
    private final Map<Integer, List<Integer>> destinationsForKey;
    
	public Queen() {
		destinationsForKey = new HashMap <Integer, List<Integer>>();
		destinationsForKey.put(0, Arrays.asList(0, 7, 9, 8, 5, 2));
		destinationsForKey.put(1, Arrays.asList(1, 2, 3, 4, 7, 5, 9));
		destinationsForKey.put(2, Arrays.asList(2, 1, 3, 5, 8, 0, 4, 6));
		destinationsForKey.put(3, Arrays.asList(1, 2, 3, 5 ,7, 6, 9));
		destinationsForKey.put(4, Arrays.asList(1, 2, 4, 5, 6, 7, 8));
		destinationsForKey.put(5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
		destinationsForKey.put(6, Arrays.asList(4, 5, 6, 2, 8, 9, 3));
		destinationsForKey.put(7, Arrays.asList(7, 4 ,1, 8, 9, 5, 3, 0));
		destinationsForKey.put(8, Arrays.asList(2, 5, 8, 0, 7, 9, 4, 6));
		destinationsForKey.put(9, Arrays.asList(7, 8, 9, 6, 3, 0, 5, 1));
	}

	@Override
	public List<Integer> getPossibleDestinations(Integer position) {
		return destinationsForKey.get(position);
	}

}
