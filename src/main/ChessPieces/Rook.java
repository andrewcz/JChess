package main.ChessPieces;

import main.Board;

/**
 * Created by andrewcz on 7/17/16.
 */
public class Rook extends Piece{
    private final static String pieceId = "R";

    public Rook(Board board, String colour) {
        super(board, colour, pieceId);
    }

    @Override
    public Boolean[][] validMoves(int row, int col) {
        int size = board.getSize();
        Boolean[][] validMoves = new Boolean[size][size];

        // loop through rows
        for (int i = 0; i < size; i++){
            // loop through columns
            for (int j = 0; j < size; j++){
                // if statements
                // cannot move to where it already is
                if(i == row && j == col){
                    validMoves[i][j] = false;
                }
                // if piece is in the way
                else if (board.checkPieceExists(i, j)){
                    Piece piece = board.getPiece(i, j);
                    // todo: check colour of piece
                    if(colour.compareTo(piece.getColour()) != 0){
                        validMoves[i][j] = true;
                    }
//                    if (board.checkPieceExists(i,j)=rookcolour);
//                        then false;
//                    if (board.checkPieceExists()=oppositecolour)
//                        then take;
                    //or move back to original square


                }
                // if on same row or on same column
                else if (i == row || j == col){
                    validMoves[i][j] = true;
                }
                // else false
                else {
                    validMoves[i][j] = false;
                }
            }
        }

        return validMoves;
    }

    // Description: check square immediately to the left if it is a valid move
    // Input: int row as current row, int col as current column, boolean[][] validMoves as current valid moves
    // Output: boolean[][] validMoves updated
    public Boolean[][] checkToLeft(int row, int col, Boolean[][] validMoves){
        // I want to check (row, col - 1)

        // Am I at the edge of the board? <-- check end of array
        // Divide by zero errors? etc

        // if no piece, mark true, check next square <-- recursion

        // if piece, check colour <-- terminates recursion

        // if same colour, mark true, but don't check next square

        return validMoves;
    }

    public boolean [][] checkToLeft(int row, int col, int piecelocation, boolean[][] validMoves){

        // check current square
        if(board.checkPieceExists(row, col)){
            Piece piece = board.getPiece(row, col);
            if(piece.colour.compareTo(colour) != 0){
                //todo complete
            }
        } else {
            validMoves[row][col] = true;
        }
//        recursion is to check square;
//        terminating conditions- if there is piece of same colour or piece of differnet colour;
//        so check square if no peice then col--;
//        build a terminating conditions;
//
//        if col-- = piece
//                terminate= take piece or return to original location;
//        or (checkToLeft());



        return validMoves;
    }


    public Boolean[][] checkNext(int row, int col, int rowMod, int colMod, Boolean[][] validMoves){


        return validMoves;
    }
}




//todo: if same colour peice as rook not a valid move
//todo: if differnet colour proceed with an action-either take or return to square
//todo:rook from before square move to next square check if peice/check colour of
//todo: of piece/then check if can take

