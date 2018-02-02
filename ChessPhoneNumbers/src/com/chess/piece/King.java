package com.chess.piece;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class King implements ChessPiece {
	// Map with the destination based on the position
    private final Map<Integer, List<Integer>> destinationsForKey;
    
	public King() {
		destinationsForKey = new HashMap <Integer, List<Integer>>();
		
		destinationsForKey.put(0, Arrays.asList(0, 7, 8, 9));
		destinationsForKey.put(1, Arrays.asList(1, 2, 4, 5));
		destinationsForKey.put(2, Arrays.asList(1, 2, 3, 4, 5, 6));
		destinationsForKey.put(3, Arrays.asList(3, 2, 5, 6));
		destinationsForKey.put(4, Arrays.asList(1, 2, 4 ,5, 7, 8));
		destinationsForKey.put(5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		destinationsForKey.put(6, Arrays.asList(2, 3, 5, 6 ,8, 9));
		destinationsForKey.put(7, Arrays.asList(7, 4, 5, 8, 0));
		destinationsForKey.put(8, Arrays.asList(4, 5, 6, 7, 8, 9, 0));
		destinationsForKey.put(9, Arrays.asList(5, 6, 8, 9, 0));
	}

	@Override
	public List<Integer> getPossibleDestinations(Integer position) {
		return destinationsForKey.get(position);
	}

}
