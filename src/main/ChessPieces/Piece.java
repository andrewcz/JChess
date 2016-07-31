package main.ChessPieces;

import main.Board;

/**
 * Created by andrewcz on 7/17/16.
 */
public abstract class Piece {
    protected Board board;
    protected String colour;
    private final String pieceId;


    public Piece(Board board, String colour, String pieceId){
        this.board = board;
        this.colour = colour;
        this.pieceId = pieceId;
    }

    // row and col is current position of piece
    public abstract Boolean[][] validMoves(int row, int col);

    public String getColour() {
        return colour;
    }

    public void print(){
        System.out.print(colour + pieceId);
    }
}
