# ChessPhoneNumbers
This is an implementation of the solution to the phone numbers based on chess moves problem. This outputs a count of all the legal phone numbers that can be generated by moving a chess piece around a standard telephone keypad.

A legal phone number has the following requirements:
* Must be 10 digits long.
* Must contain only digits (no * or #).

The telephone keypad layout is:
123<br>
456<br>
789<br>
*0#<br>

The program must take its input from the command line, accepting:
* The name of a chess piece (king, queen, bishop, knight, rook, pawn).
* A starting digit, 0 to 9.

Rules:
A legal move is defined as any move that is normally legal for the piece in chess, with the following additions:
* Staying in place is a legal move for all pieces.
* When a pawn reaches the top row, it becomes a queen.
A pawn, starting on one of the bottom two rows (one of the digits 7, 8, 9 or 0), may move either one or two spaces forward the first time it moves .


## To execute:
java -jar ChessPhoneNumbers.jar [knight,queen,king,bishop,rook,pawn] [position key pad]

### Examples:
java -jar ChessPhoneNumbers.jar pawn 1 <br>
java -jar ChessPhoneNumbers.jar knight 5 <br>
java -jar ChessPhoneNumbers.jar king 3

