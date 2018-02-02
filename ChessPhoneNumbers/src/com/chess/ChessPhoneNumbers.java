package com.chess;

import com.chess.piece.Bishop;
import com.chess.piece.ChessPiece;
import com.chess.piece.King;
import com.chess.piece.Knight;
import com.chess.piece.Pawn;
import com.chess.piece.Queen;
import com.chess.piece.Rook;

public class ChessPhoneNumbers {


	/** The chess piece the user selected. */
    private final ChessPiece chessPiece;

    /** Constructor */
    public ChessPhoneNumbers(final ChessPiece piece) {
        chessPiece = piece;
    }
    
    /** Main method **/
	public static void main(String[] args) {
		final String willBeUsed = args[0];
        final int position = Integer.valueOf(args[1]);
        
        int l = 10;
        if (args.length > 2) {
            l = Integer.valueOf(args[2]);
        }
        
        ChessPhoneNumbers chess;
		try {
			chess = new ChessPhoneNumbers(getPieceClass(willBeUsed));

			System.out.println(chess.getTotalPossibleNumbers(position, l-1));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

    /**
     * Method to get number of possible phone numbers using the current position and the number of
     * digits.
     * @param pos - of phone key pad
     * @param digit - digits remaining.
     * @return The total number of possible phone numbers.
     */
    public long getTotalPossibleNumbers(final int pos,
                                        final int digit) {
        long totalPossibilities = 0;

        if (digit == 1) {
            totalPossibilities += chessPiece.getPossibleDestinations(pos).size();
        }
        else {
            for (int newPos : chessPiece.getPossibleDestinations(pos)) {
                chessPiece.registerMoveTo(newPos);
                totalPossibilities += getTotalPossibleNumbers(newPos, digit - 1);
            }
        }
        return totalPossibilities;
    }


	
	/**
	 * Private method to create a Piece Class
	 * @param pieceName
	 * @return
	 * @throws Throwable
	 */
	private static ChessPiece getPieceClass(final String pieceName) throws Throwable {
		switch (pieceName) {
		case "knight":{	
			return new Knight();
		}
		case "queen":{	
			return new Queen();
		}
		case "king":{	
			return new King();
		}
		case "bishop":{	
			return new Bishop();
		}
		case "rook":{	
			return new Rook();
		}
		case "pawn":{	
			return new Pawn();
		}
		default:
			break;
		}
        throw new Throwable("Cannot to create the chess piece : " + pieceName +
        					   ". Please, considere the following [knight,queen,king,bishop,rook,pawn] ");
	}

}
