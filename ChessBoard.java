public class ChessBoard {

private ChessPiece[][] board=new ChessPiece[8][8];

public ChessPiece[][] getBoard() {

return board;

}

public void setBoard(ChessPiece[][] board) {

this.board = board;

}

public ChessBoard() {

// TODO Auto-generated constructor stub

}

public ChessBoard(ChessPiece[][] board) {

this.board=board;

}

public ChessPiece get(int i, int j) {

return board[i][j];

}

public void set(int i, int j, ChessPiece piece) {

if(board[i][j]!=null) {

System.out.println("position already occupied");

return;

}

board[i][j]=piece;

}

}