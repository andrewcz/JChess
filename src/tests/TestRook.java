package tests;
import main.*;
import main.ChessPieces.Rook;

/**
 * Created by andrewcz on 7/17/16.
 */
public class TestRook {

    public static void main(String[] args){
        Board board = new Board();
        Rook rook = new Rook(board, "w");

        board.placePiece(4, 4, rook);

        board.print();
    }

}
