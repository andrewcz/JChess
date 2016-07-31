package main;

import main.ChessPieces.Piece;

/**
 * Created by andrewcz on 7/17/16.
 */
public class Board {
    public static final int DEFAULT_SIZE = 8;
    private final int size;
    private final int rows;
    private final int cols;

    private Piece[][] board;

    public Board(){
        size = DEFAULT_SIZE;
        rows = DEFAULT_SIZE;
        cols = DEFAULT_SIZE;
        board = new Piece[size][size];
    }

    public Board(int size){
        this.size = size;
        rows = size;
        cols = size;
        board = new Piece[size][size];
    }

    public void clearBoard(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                board[i][j] = null;
            }
        }
    }

    public int getSize(){
        return size;
    }



//    public void placePiece(String placement){
//
//    }
//
//    public void placePiece(Piece[][] placement){
//
//    }

    public void placePiece(int row, int col, Piece piece){
        board[row][col] = piece;
    }

    public boolean checkPieceExists(int row, int col) {
        return  board[row][col] != null;
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void print() {
        char c = 'a';
        for(int i = 0; i < size + 1; i++){
            System.out.print("|");
            for (int j = 0; j < size + 1; j++){
                if (i == size){
                    if (j == size){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print(c++);
                        System.out.print(" ");
                    }
                }
                else if(j == size){
                    System.out.print(size - i + " ");
                }
                else {
                    if (board[i][j] == null){
                        System.out.print("  ");
                    }
                    else {
                        board[i][j].print();
                    }
                }



                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void printDetails() {
        System.out.println("DEFAULT_SIZE = " + DEFAULT_SIZE);
        System.out.println("size = " + size);
        System.out.println("rows = " + rows);
        System.out.println("cols = " + cols);
//        public static final int DEFAULT_SIZE = 8;
//        private final int size;
//        private final int rows;
//        private final int cols;
    }
}
